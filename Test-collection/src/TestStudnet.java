import org.junit.Test;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/19 22:10
 * @description:
 */
public class TestStudnet {
    private  Studnet studnet;

   public  void setStu(Studnet xyz){
       this.studnet=xyz;
       System.out.println(studnet);
   }

    @Test
    public void ce(){
       setStu(new Studnet());
    }

}
