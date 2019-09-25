package core.zoo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import core.less6.Gender;
import core.less6.Person;

public class Controller implements Serializable{
	private static final long serialVersionUID = 7098564003312294217L;

		private static  Map<Person, List<Pet>> zooClub = restore();

		private static Set<Entry<Person, List<Pet>>> entrySet = zooClub.entrySet();
			
		public static Set<Entry<Person, List<Pet>>> getEntrySet() {
			return entrySet;
		}
		public static Scanner in = new Scanner(System.in);

		static void addMember() {
			System.out.println("Enter name");
			String name = in.next();
			System.out.println("Enter age");
			int age = in.nextInt();
			System.out.println("Enter male");
			String male = in.next();
			Gender gender = Gender.valueOf(male.toUpperCase());
			zooClub.put(new Person(name, age, gender), new ArrayList<>());
			save();
		}

		static void addAnimalForMember() {
			entrySet = zooClub.entrySet();
			String name;
			int age;
			String animal;
			System.out.println("Enter person name");
			name = in.next();
			for (Entry<Person, List<Pet>> iter : entrySet) {
				Person key = iter.getKey();
				if (key.getName().equals(name)) {
					System.out.println("Enter pet age");
					age = in.nextInt();
					System.out.println("Enter what kind of animal do you want");
					animal = in.next();
					zooClub.get(key).add(new Pet(age, animal));
				}
			}
			save();
		}

		static void deleteMember() {
			entrySet = zooClub.entrySet();
			String name;
			System.out.println("Enter person name");
			name = in.next();
			for (Entry<Person, List<Pet>> iter : entrySet) {
				Person key = iter.getKey();
				if (key.getName().equals(name)) {
					zooClub.remove(key);
				}
			}
		}
		
		static void deletePetFromAllMembers() {
			entrySet = zooClub.entrySet();
			String name;
			System.out.println("Enter pet name ");
			name = in.next();
			for (Entry<Person, List<Pet>> iter : entrySet) {
				List<Pet> pet = iter.getValue();
				Iterator<Pet> iterPet = pet.iterator();
				while(iterPet.hasNext()) {
					Pet pet1 = iterPet.next();
					if (pet1.getAnimal().equals(name)) {
						iterPet.remove();
					}
				}
			}
		}

		static void deletePetFromMember() {
			entrySet = zooClub.entrySet();
			System.out.println("Enter name ");
			String name = in.next();
			System.out.println("Enter what kind of animal");
			String namePet = in.next();
			for (Entry<Person, List<Pet>> iter : entrySet) {
				Person key = iter.getKey();
				List<Pet> pet = iter.getValue();
				Iterator<Pet> iterPet = pet.iterator();
				while(iterPet.hasNext()) {
					Pet pet1 = iterPet.next();
					if (pet1.getAnimal().equals(namePet)
							&& key.getName().equals(name)) {
						iterPet.remove();
					}
				}
			}
		}

		static void showZooClub() {
			entrySet = zooClub.entrySet();
			for (Entry<Person, List<Pet>> entry : entrySet) {
				Person key = entry.getKey();
				System.out.print(key);
				for (Pet pet : entry.getValue()) {
					System.out.print(" -> " + pet);
				}
				System.out.println();
			}
		}
		//NEXT DZ FOR FILE
		public Map<Person, List<Pet>> restorfromTXT(String fileName){
			 File file = new File(fileName + ".txt");
		        if (file.exists()) {
		            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file)))) {
		                Person person = null;
		                while (br.ready()) {
		                    String line = br.readLine();
		                    if (!line.isEmpty()) {
		                        if (!(line.codePointAt(0) == "$".codePointAt(0))) {
		                            String[] ar = line.split("\\ ");
		                            person = new Person (ar[0], Integer.valueOf(ar[1]),Gender.valueOf(ar[2]));
		                            zooClub.put(person, new ArrayList<Pet>());
		                        }
		                        if (line.codePointAt(0) == "$".codePointAt(0)) {
		                            line = line.substring(1);
		                            String[] ar = line.split("\\ ");
		                            Pet pet = new Pet (Integer.valueOf(ar[1]),ar[0]);
		                            if(person != null) zooClub.get(person).add(pet);
		                        }
		                    }
		                }
		                return zooClub;
		            } catch (IOException e) {
		            }
		        }
		        return new HashMap<>();
		}
		public void reWriteTXT(String fileName){
			File file = new File(fileName+".txt");
			if(file.exists()){
				Map<Person, List<Pet>> map1 = new HashMap<>(zooClub);
				zooClub.putAll( restorfromTXT(fileName));
				zooClub.putAll(map1);
				writeTXT(fileName);
			}
		}
		public void writeTXT(String fileName){
			File file = new File(fileName+".txt");
			try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(file)))){
				entrySet = zooClub.entrySet();
				for (Entry<Person, List<Pet>> entry : entrySet){
					Person key = entry.getKey();
					pw.println(key.getName()+" "+key.getAge()+" "+key.getGender());
					for(Pet pet: entry.getValue()){
						pw.println("$"+pet.getAnimal()+" "+pet.getAge());
					}	
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		@SuppressWarnings("unchecked")
		private static Map<Person, List<Pet>> restore(){
			File file = new File("save.bf");
			if(file.exists()){
				try(ObjectInputStream ois = 
					new ObjectInputStream(new FileInputStream(file))){
					return (Map<Person,List<Pet>>)ois.readObject();
				}catch (IOException | ClassNotFoundException e) {
				}
//				InputStream is = null;
//				ObjectInputStream ois = null;
//				try{
//					is = new FileInputStream(file);
//					ois = new ObjectInputStream(is);
//					return (List<Person>) ois.readObject();
//				}catch(IOException | ClassNotFoundException e){
//				}finally{
//					if(ois!=null){
//						try {
//							ois.close();
//						} catch (IOException e) {
//						}
//					}
//					if(is!=null){
//						try {
//							is.close();
//						} catch (IOException e) {
//						}
//					}
//				}
			}
			return new HashMap<>();
		}
		private static void save(){
			try(ObjectOutputStream oos = 
			new ObjectOutputStream(new FileOutputStream(new File("save.bf")))){
				oos.writeObject(zooClub);
				oos.flush();
			}catch (IOException e) {
			}
		}
}