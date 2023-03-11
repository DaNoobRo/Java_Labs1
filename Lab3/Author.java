package Lab3;

public class Author {

    private final String name;
    private String email;
    private final char gender;
    public Author (String name, String email, char gender) {
                this.name=name;
                this.email=email;
                this.gender=gender;
    }

    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString(){
        return "name is "+name+"("+gender+")"+" at email "+email;
    }
    public static void main(String[] args){
        Author JohnDoe=new Author("Ada","ba@gmail.com",'f');
        System.out.println(JohnDoe.getName());
        System.out.println(JohnDoe.getEmail());
        System.out.println(JohnDoe.getGender());
        System.out.println(JohnDoe);
        JohnDoe.setEmail("carvona2001@gmail.com");
        System.out.println(JohnDoe);

    }
}
