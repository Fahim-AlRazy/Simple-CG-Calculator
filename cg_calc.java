import java.util.Scanner;
public class cg_calc{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    double cg=0.0,total_point=0.0,point=0.0,cred_2=0.0,cred_3=0.0,cred_4=0.0;
    int cred2_count=0,cred3_count=0,cred4_count=0,select=0;
    System.out.print("How Many Credits have you completed ? \n your answer : ");
    int total_cred=sc.nextInt();
    System.out.print("Do you have 2 credit courses ? Make a selection  :: 1.Yes   2.No  \n Please enter 1 or 2 : ");
    select=sc.nextInt();
    if(select==1){ // 2 credit course point calculation 
      System.out.print("How Many ? :");
      cred2_count=sc.nextInt();
      System.out.print("Please enter the points in the scale of 4 continiously that you have achieved in the 2 credit courses ");
      for(int i=0;i<cred2_count;i++){
        point=sc.nextDouble();
        cred_2+=point*2;
      }
    }
    System.out.print("Do you have 3 credit courses ? Make a selection  :: 1.Yes   2.No  \n Please enter 1 or 2 : ");
    select=sc.nextInt();
    if(select==1){ // 3 credit course point calculation 
      System.out.print("How Many ? :");
      cred3_count=sc.nextInt();
      System.out.print("Please enter the points in the scale of 4 continiously that you have achieved in the 3 credit courses ");
      for(int i=0;i<cred3_count;i++){
        point=sc.nextDouble();
        cred_3+=point*3;
      }
    }
    System.out.print("Do you have 4 credit courses ? Make a selection  :: 1.Yes   2.No  \n Please enter 1 or 2 : ");
    select=sc.nextInt();
    if(select==1){ // 4 credit course point calculation 
      System.out.print("How Many ? :");
      cred4_count=sc.nextInt();
      System.out.print("Please enter the points in the scale of 4 continiously that you have achieved in the 4 credit courses ");
      for(int i=0;i<cred4_count;i++){
        point=sc.nextDouble();
        cred_4+=point*4;
      }
    }
    total_point=cred_2+cred_3+cred_4;
    cg=total_point/total_cred;
    System.out.println();
    System.out.printf("Your Total CG is : %.2f",cg);
  }
}
