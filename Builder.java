class User
{
    //Variables
    private final int rollNum;
    private final String name;
    private final String email;


    //Private constructor of Outer class
    private User(UserBuilder b)
    {
        this.rollNum = b.rollNum;
        this.name = b.name;
        this.email = b.email;
    }


    //Getter methods
    public int getRollNum() {
        return rollNum;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }


    /* BUILDER CLASS */
    static class UserBuilder
    {
        //Variables
        private int rollNum;
        private String name;
        private String email;


        //Setter methods
        public UserBuilder setRollNum(int rollNum) {
            this.rollNum = rollNum;
            return this;
        }
        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }
        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;
        }


        //Copying values into Outer class
        User build()
        {
            User u = new User(this);
            return u;
        }
    }


    /* MAIN METHOD */
    public static void main(String[] args)
    {
         //Initializing variables using constructor of Builder class
        UserBuilder builder = new UserBuilder();
        User obj = builder.setRollNum(123)
                .setName("Rishabh")
                .setEmail("rishabhshukla@gmail.com")
                .build();

        //Printing the output
        System.out.println(STR."\{obj.getRollNum()} : \{obj.getName()} : \{obj.getEmail()}");
    }
}