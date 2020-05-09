public class PersonServiceBean {
    PersonDao personDao;

    public PersonDao getPersonDao() {
        return personDao;
    }

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public  static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");

        PersonServiceBean personServiceBean=(PersonServiceBean)applicationContext.getBean("personServiceBean");

        personServiceBean.personDao.save();

    }

}
