/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Backup;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Surya0499
 */
public class RegistrationAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    Connector employeeDao = new Connector();
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
           
        String username = request.getParameter("username");
        String userid = request.getParameter("userid");
        String password = request.getParameter("password");
        String reenterpassword = request.getParameter("reenterpassword");
        String address = request.getParameter("address");
        String state = request.getParameter("state");
        String country = request.getParameter("country");

        RegistrationBean employee = new RegistrationBean();
        employee.setUsername(username);
        employee.setUserid(userid);
        employee.setPassword(password);
        employee.setReenterpassword(reenterpassword);
        employee.setAddress(address);
        employee.setState(state);
        employee.setCountry(country);

        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return mapping.findForward(SUCCESS);
    }
}
