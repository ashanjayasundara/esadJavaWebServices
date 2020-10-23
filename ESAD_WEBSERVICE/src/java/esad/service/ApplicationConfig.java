/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esad.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author ashan
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(esad.service.AdvertisementFacadeREST.class);
        resources.add(esad.service.AdvertisementTypeFacadeREST.class);
        resources.add(esad.service.AdvertisementTypeHasCartFacadeREST.class);
        resources.add(esad.service.CartFacadeREST.class);
        resources.add(esad.service.InvoiceFacadeREST.class);
        resources.add(esad.service.InvoiceHasAdvertisementTypeFacadeREST.class);
        resources.add(esad.service.MessageFacadeREST.class);
        resources.add(esad.service.PaymentDetailFacadeREST.class);
        resources.add(esad.service.SampleFacadeREST.class);
        resources.add(esad.service.Test2FacadeREST.class);
        resources.add(esad.service.UserFacadeREST.class);
        resources.add(esad.service.UserTypeFacadeREST.class);
        resources.add(esad.service.UsersFacadeREST.class);
    }
    
}
