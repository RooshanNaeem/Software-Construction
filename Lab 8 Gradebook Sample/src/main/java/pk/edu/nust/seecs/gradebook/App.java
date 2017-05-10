package pk.edu.nust.seecs.gradebook;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import pk.edu.nust.seecs.gradebook.BOs.Bo;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pk.edu.nust.seecs.gradebook.dao.CloDao;
import pk.edu.nust.seecs.gradebook.entity.Clo;

/**
 * My main App. 
 * <p>
 This executes everything.
 */

public class App {

    public static void main(String[] args) {
        CloDao clodao = new CloDao();

        // Add new clo
        //ConfigurableApplicationContext c = new ClassPathXmlApplicationContext();
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Bo b = (Bo) context.getBean("Bos");
        Clo clo = new Clo();
        clo.setName("CLO 2");
        clo.setDescription("Design efficient solutions for algorithmic problems");
        clo.setPlo("3");
        clodao.addClo(clo);

        clodao.updateClo(clo);

        // Delete an existing clo
        //dao.deleteClo(1);

        // Get all clos
      /* for (Clo iter : clodao.getAllClos()) {
            System.out.println(iter);
        }

        // Get clo by id
        System.out.println(clodao.getCloById(1));
        */
        b.getClocsv();
        
        
    }

}