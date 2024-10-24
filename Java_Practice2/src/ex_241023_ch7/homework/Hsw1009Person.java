package ex_241023_ch7.homework;

class Hsw1009Person {
    private String name;
    private String contact;
    private String registrationDate;

    public void Person(String name, String contact, String registrationDate) {
        this.name = name;
        this.contact = contact;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public String getContact() {
        return contact;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    @Override
    public String toString() {
        return "이름: " + name + ", 연락처: " + contact + ", 등록 날짜: " + registrationDate;
    }
}
