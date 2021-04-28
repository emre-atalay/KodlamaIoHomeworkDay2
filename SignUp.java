public class SignUp {
    public String NameAndSirname;
    public String eMail;
    public String password;
    public String passwordCorrect;
    public boolean acceptInfoMail;
    public boolean termsOfUseAndPrivacyPolicy;
    public SignUp(String nameAndSirname , String eMail , String password , String passwordCorrect , boolean acceptInfoMail , boolean termsOfUseAndPrivacyPolicy  ) {
        System.out.println("Press SignUp");
        this.NameAndSirname = nameAndSirname ;
        this.eMail = eMail;
        this.password  = password;
        this.passwordCorrect = passwordCorrect;
        this. acceptInfoMail = acceptInfoMail;
        this.termsOfUseAndPrivacyPolicy = termsOfUseAndPrivacyPolicy ;
    }
}
