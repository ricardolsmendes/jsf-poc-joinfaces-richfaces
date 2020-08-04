package br.dev.ricardomendes.joinfacesrichfaces.view;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class RequestScopedBean implements Serializable {

    private static final long serialVersionUID = -6983097505938765659L;

    private final Date requestTime = Calendar.getInstance().getTime();

    public Date getRequestTime() {

        return requestTime;
    }

}
