import java.util.*;



class Emp{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    Scanner sc=new Scanner(System.in);
    void input(){
        System.out.println("Enter Id");
        id=sc.nextInt();
        System.out.println("Enter Name");
        name=sc.nextLine();
        name=sc.nextLine();
    }
    void show(){
        System.out.println("Id:"+id+"\nName:"+name);
    }
}
class Worker extends Emp{
    private double dewages;
    public double getDewages() {
        return dewages;
    }
    public void setDewages(double dewages) {
        this.dewages = dewages;
    }
    void input(){
        System.out.println("Enter Record for Worker");
        super.input();
        System.out.println("Enter dewages");
        dewages=sc.nextDouble();
    }
    void show(){
        super.show();
        System.out.println("Dewages:"+dewages);
    }
}
class Manager extends Emp{
    private double sal;
    private String dep;
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public String getDep() {
        return dep;
    }
    public void setDep(String dep) {
        this.dep = dep;
    }
    void input(){
        System.out.println("Enter Record for Manager");
        super.input();
        System.out.println("Enter Salary and Department");
        sal=sc.nextDouble();
        dep=sc.nextLine();
        dep=sc.nextLine();
    }
    void show(){
        super.show();
        System.out.println("Salary:"+sal+"\nDepartment:"+dep);
    }
}
class Engineer extends Emp{
    private double sal;
    private String prog;
    public double getSal() {
        return sal;
    }
    public String getProg() {
        return prog;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public void setProg(String prog) {
        this.prog = prog;
    }
    void input(){
        System.out.println("Enter Record for Engineer");
        super.input();
        System.out.println("Enter Salary & Progect");
        sal=sc.nextDouble();
        prog=sc.nextLine();
        prog=sc.nextLine();
    }
    void show(){
        super.show();
        System.out.println("Salary:"+sal+"\nProject:"+prog);
    }
}
public class EmpManagment {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // Veriable Declareshion
        int id,ch,ch1;
        do{
            System.out.println("***** WELCOME TO EMPLOYEE MANAGMENT SYSTEM *****");
            System.out.println("1.Worker");
            System.out.println("2.Manager");
            System.out.println("3.Engineer");
            System.out.println("0.Exit ");
            ch=sc.nextInt();
            switch(ch){
                case 1:
                    Worker w[]=new Worker[10];
                    int contW=0;
                    do{
                        System.out.println("*******Workers*******");
                        System.out.println("1.Add");
                        System.out.println("2.Eidit");
                        System.out.println("3.Delete");
                        System.out.println("4.Find");
                        System.out.println("5.Show All");
                        System.out.println("0.Exit Form Workers Menu");
                        ch1=sc.nextInt();
                        switch(ch1){
                            case 1:
                            // Worker Add New Record 
                                if(contW<10){
                                    w[contW]=new Worker();
                                    w[contW].input();
                                    contW++;
                                }
                                else 
                                    System.out.println("Worker DataBase Are Full You Cant Add More Record");
                            break;
                            
                            // Worker Eidit Record
                            case 2:
                                System.out.println("Enter Employee Id To Eidit Record");
                                id=sc.nextInt();
                                for(int i=0;i<contW;i++){
                                    if(w[i].getId()==id){
                                        System.out.println("Record Are Found");
                                        w[i].show();
                                        int chtem;
                                        System.out.println("What You Want To Eidit In Worker Record");
                                        System.out.println("1.Name");
                                        System.out.println("2.Dewages");
                                        System.out.println("0.Cancel");
                                        chtem=sc.nextInt();
                                        if(chtem==1){
                                            System.out.println("Enter New Name ");
                                            sc.nextLine();
                                            String tn=sc.nextLine();
                                            w[i].setName(tn);
                                            System.out.println("Name Changed Sucefully");
                                        }
                                        else if(chtem==2){
                                            System.out.println("Enter New Dewages");
                                            double dt=sc.nextDouble();
                                            w[i].setDewages(dt);
                                            System.out.println("Dewages Changes Sucefully");
                                        }
                                        else if(chtem==0){
                                            System.out.println("Canclled");
                                        }
                                        else 
                                            System.out.println("Envalid Choice");
                                    }
                                }
                            break;

                            // Worker Data Delete
                            case 3:
                                System.out.println("Enter Id For Delete Record");
                                id=sc.nextInt();
                                for(int i=0;i<contW;i++){
                                    if(w[i].getId()==id){
                                        System.out.println("Record Found ");
                                        System.out.println("********************");
                                        w[i].show();
                                        System.out.println("********************");
                                        System.out.println("Do You Want To Delete Record");
                                        System.out.println("1.Yes \n0.No");
                                        int t=sc.nextInt();
                                        if(t==1){
                                            w[i]=new Worker();
                                            System.out.println("Record Deleted Succefully");
                                        }
                                        else if(t==0){
                                            System.out.println("Record Deletion Calcalled");
                                        }
                                        else 
                                            System.out.println("Envalid Choice");
                                    }
                                }
                            break;

                            // Worker Reocrd Find 
                            case 4:
                                System.out.println("Ente Id For Find Record ");
                                id=sc.nextInt();
                                for(int i=0;i<contW;i++){
                                    if(w[i].getId()==id){
                                        System.out.println("Reocord Are Found ");
                                        System.out.println("********************");
                                        w[i].show();
                                        System.out.println("********************");
                                    }
                                    else 
                                        System.out.println("Envalid Id Record Not Found");
                                }
                            break;

                            // Show All Worker Data 
                            case 5:
                                
                                if(contW>0){
                                    System.out.println("********************");
                                    System.out.println("All Workers Reocrds ");
                                    for(int i=0;i<contW;i++)
                                        w[i].show();
                                    System.out.println("********************");
                                }
                                else{
                                    System.out.println("Their are No Records");
                                }
                            break;

                            case 0:
                                System.out.println("Exited In Workers Meanu");
                            break;

                            default:
                                System.out.println("Evalid Choice");
                        }
                    }while(ch1!=0);
                    // Worker's While End Here 
                break;

                case 2:
                    int contM=0;
                    Manager m[]=new Manager[5];
                    do{
                        System.out.println("********** Manager ***********");
                        System.out.println("1.Add New Record");
                        System.out.println("2.Eidit Reord");
                        System.out.println("3.Delete Record");
                        System.out.println("4.Find Record");
                        System.out.println("5. Show All ");
                        System.out.println("0.Exit From Managers Menu");
                        ch1=sc.nextInt();

                        switch(ch1){
                            case 1:
                            // Add Record of Manager 
                                if(contM<5){
                                    m[contM]=new Manager();
                                    m[contM].input();
                                    contM++;
                                }
                                else 
                                    System.out.println("Manager Record DataBase Are Full You Can't Add More Records");
                            break;

                            // Eidit Records of Manager 
                            case 2:
                                System.out.println("Enter Id For Eidit Record");
                                id=sc.nextInt();
                                for(int i=0;i<contM;i++){
                                    if(m[i].getId()==id){
                                        System.out.println("Record Found ");
                                        System.out.println("********************");
                                        m[i].show();
                                        System.out.println("********************");
                                        System.out.println("What You Want To Eidit");
                                        System.out.println("1.Name\n2.Salary\n3.Department\n0.Exit");
                                        int t=sc.nextInt();
                                        if(t==1){
                                            System.out.println("Enter New Name ");
                                            sc.nextLine();
                                            m[i].setName(sc.nextLine());
                                            System.out.println("Name Changed Succefully");
                                        }
                                        else if(t==2){
                                            System.out.println("Enter New Salary");
                                            m[i].setSal(sc.nextDouble());
                                            System.out.println("Salary Changed Sucefully");
                                        }
                                        else if(t==3){
                                            System.out.println("Enter New Departmant");
                                            sc.nextLine();
                                            m[i].setDep(sc.nextLine());
                                            System.out.println("Department Changed Sucefully");
                                        }
                                        else if(t==0)
                                            System.out.println("Canclled");
                                        else 
                                            System.out.println("Envalid Choice");
                                    }
                                }
                            break;

                            // Delete Record for Manager 
                            case 3:
                                System.out.println("Enter Id For Delete Record");
                                id=sc.nextInt();
                                for(int i=0;i<contM;i++){
                                    if(m[i].getId()==id){
                                        System.out.println("********************");
                                        m[i].show();
                                        System.out.println("********************");
                                        System.out.println("Do You Want To Delete");
                                        System.out.println("1.Yes\n0.No");
                                        int t=sc.nextInt();
                                        if(t==1){
                                            m[i]=new Manager();
                                            System.out.println("Record Deleted Succefully");
                                        }
                                        else if(t==0){
                                            System.out.println("Record Deletion Calenclled");
                                        }
                                        else 
                                            System.out.println("Envalid Choice");
                                    }
                                }
                            break;

                            // Find Records for Manager
                            case 4:
                                System.out.println("Enter Id to Find Record");
                                id=sc.nextInt();
                                for(int i=0;i<contM;i++){
                                    if(m[i].getId()==id){
                                        System.out.println("********************");
                                        System.out.println("Record Are Found ");
                                        m[i].show();
                                        System.out.println("********************");
                                        break;
                                    }
                                }
                            break;

                            // Show All Record OF Manager 
                            case 5:
                                System.out.println("All Manager Reocrds");
                                for(int i=0;i<contM;i++)
                                    m[i].show();
                            break;

                            case 0:System.out.println("Exited From Manager Menu");
                            break;

                            default:System.out.println("Envalid Choice");
                        }

                    }while(ch1!=0);
                break;

                // Engineer
                case 3:
                    int contE=0;
                    Engineer e[]=new Engineer[3];
                    do{
                        System.out.println("********** Engineer ***********");
                        System.out.println("1.Add New Record");
                        System.out.println("2.Eidit Reord");
                        System.out.println("3.Delete Record");
                        System.out.println("4.Find Record");
                        System.out.println("5. Show All ");
                        System.out.println("0.Exit From Engineers Menu");
                        ch1=sc.nextInt();

                        switch(ch1){
                            case 1:
                            // Add Record of Engineer 
                                if(contE<3){
                                    e[contE]=new Engineer();
                                    e[contE].input();
                                    contE++;
                                }
                                else 
                                    System.out.println("Engineer Record DataBase Are Full You Can't Add More Records");
                            break;

                            // Eidit Records of Engineer 
                            case 2:
                                System.out.println("Enter Id For Eidit Record");
                                id=sc.nextInt();
                                for(int i=0;i<contE;i++){
                                    if(e[i].getId()==id){
                                        System.out.println("********************");
                                        System.out.println("Record Found ");
                                        e[i].show();
                                        System.out.println("********************");
                                        System.out.println("What You Want To Eidit");
                                        System.out.println("1.Name\n2.Salary\n3.Project\n0.Exit");
                                        int t=sc.nextInt();
                                        if(t==1){
                                            System.out.println("Enter New Name ");
                                            sc.nextLine();
                                            e[i].setName(sc.nextLine());
                                            System.out.println("Name Changed Succefully");
                                        }
                                        else if(t==2){
                                            System.out.println("Enter New Salary");
                                            e[i].setSal(sc.nextDouble());
                                            System.out.println("Salary Upgraded Sucefully");
                                        }
                                        else if(t==3){
                                            System.out.println("Enter New Project");
                                            sc.nextLine();
                                            e[i].setProg(sc.nextLine());
                                            System.out.println("Project Upgraded Sucefully");
                                        }
                                        else if(t==0)
                                            System.out.println("Canclled");
                                        else 
                                            System.out.println("Envalid Choice");
                                    }
                                }
                            break;

                            // Delete Record for Manager 
                            case 3:
                                System.out.println("Enter Id For Delete Record");
                                id=sc.nextInt();
                                for(int i=0;i<contE;i++){
                                    if(e[i].getId()==id){
                                        System.out.println("********************");
                                        e[i].show();
                                        System.out.println("********************");
                                        System.out.println("Do You Want To Delete");
                                        System.out.println("1.Yes\n0.No");
                                        int t=sc.nextInt();
                                        if(t==1){
                                            e[i]=new Engineer();
                                            System.out.println("Record Deleted Succefully");
                                        }
                                        else if(t==0){
                                            System.out.println("Record Deletion Calenclled");
                                        }
                                        else 
                                            System.out.println("Envalid Choice");
                                    }
                                }
                            break;

                            // Find Records for Manager
                            case 4:
                                System.out.println("Enter Id to Find Record");
                                id=sc.nextInt();
                                for(int i=0;i<contE;i++){
                                    if(e[i].getId()==id){
                                        System.out.println("********************");
                                        System.out.println("Record Are Found ");
                                        e[i].show();
                                        System.out.println("********************");
                                        break;
                                    }
                                }
                            break;

                            // Show All Record OF Manager 
                            case 5:
                                if(contE>0){
                                    System.out.println("********************");
                                    System.out.println("All Manager Reocrds");
                                    for(int i=0;i<contE;i++)
                                        e[i].show();
                                        System.out.println("********************");
                                }
                            break;

                            case 0:System.out.println("Exited From Engineer Menu");
                            break;

                            default:System.out.println("Envalid Choice");
                        }

                    }while(ch1!=0);
                break;

                case 0:
                    System.out.println("Thank U...");
            }
            // Mean Switch End Here 
        }while(ch!=0);
        // Mean Do While End Here 
        sc.close();
    }
    // Main Function End Here 
}
// Mean Class Employee Mangment End Here 