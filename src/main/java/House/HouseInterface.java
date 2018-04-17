package House;

public interface HouseInterface {

    /**
     * 增加一个人到house里面。
     */
    void addPerson(Person person);

    /**
     * 增加一个水果到house里面。
     * @param fruit
     */
    void addFruit(Fruit fruit);

    /**
     * 时光飞逝一天，house里面所有的person会根据他们的食量吃水果，他们会从大到小吃水果，如果水果够吃，返回true，如果不够吃，返回false。
     * 每一个水果只要被吃过，第二天就不能再吃了。
     */
    boolean timeFly();
    
    /**
     * 返回现有的水果总量。 
     */
    int getTotalFruit();
}
