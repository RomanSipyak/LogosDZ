package ua.controller;




public class Main {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
//		OpenClose open = em.find(OpenClose.class, 1);
//		OpenClose close = em.find(OpenClose.class, 4);
////		openClose.setTime(LocalTime.of(10, 0));
////		em.remove(openClose);
//		Cafe cafe = new Cafe();
//		cafe.setAddress("Lviv, sq. Shevchenka 25");
//		cafe.setClose(close);
//		cafe.setEmail("sdfkjds@dfj.df");
//		cafe.setFullDescription("Full desc");
//		cafe.setName("Addada");
//		cafe.setOpen(open);
//		cafe.setPhone("+358956454");
//		cafe.setShortDescription("Short desc");
//		cafe.setType(Type.CAFE);
//		em.persist(cafe);
//		em.getTransaction().commit();
		em.close();
		factory.close();
	}
}

