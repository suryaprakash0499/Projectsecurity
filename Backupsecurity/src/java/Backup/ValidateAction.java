/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Surya0499
 */
public class ValidateAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
     private static final String SUCCESS = "success";
private static final String WelcomeAdmin ="admin";
private static final String WelcomeCustomer ="customer";
private static final String Error ="error";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String userid=request.getParameter("userid");
        String password=request.getParameter("password");
        String role=request.getParameter("r1");
        Connector employeeDao= new Connector();
        LoginBean employee = new LoginBean();
        employee.setUserid(userid);
        employee.setPassword(password);
        RegistrationConnector employeedao= new RegistrationConnector();

        try{
            if(employeeDao.validate(employee))
            {
            
            return mapping.findForward(WelcomeAdmin);
            }
            else if(employeedao.validate(employee))
            {
             return mapping.findForward(WelcomeCustomer);
            }
            else
            {
                return mapping.findForward(Error);
            }
        }catch(Exception e){
         // TODO Auto-generated catch block
            e.printStackTrace();       
    }
         return mapping.findForward(SUCCESS);
    }
}
