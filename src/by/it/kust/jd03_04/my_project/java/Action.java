package by.it.kust.jd03_04.my_project.java;


enum Action {
    SIGNUP {
        {
            this.command = new CommandSignUp();
            this.inPage="/signup.jsp";
            this.okPage ="/login.jsp";
        }
    },
    LOGIN {
        {
            this.command = new CommandLogin();
            this.inPage="/login.jsp";
            this.okPage ="/main.jsp";
        }
    },
    LOGOUT {
        {
            this.command = new CommandLogout();
            this.inPage="/login.jsp";
            this.okPage ="/login.jsp";
        }
    },
    ERROR {
        {
            this.command = new CommandLogout();
        }
    };
    public String inPage="/error.jsp";
    public String okPage ="/error.jsp";
    public ActionCommand command;

    public ActionCommand getCurrentCommand() {
        return command;
    }

    public static final String msgError="msg_error";
    public static final String msgMessage="message";

}