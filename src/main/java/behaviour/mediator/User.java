package behaviour.mediator;

public class User {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public User setAge(Integer age) {
        this.age = age;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public void sendMessage(String message){
        ChatRoom.showMessage(this, message);
    }
}
