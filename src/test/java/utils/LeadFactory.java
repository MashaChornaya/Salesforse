package utils;

import Models.Lead;

public class LeadFactory {
   public static Lead getEmptyLead(){
    return Lead.builder().lastName("").company("").build();
}

    public static Lead getFullInfoLead(){
    return Lead.builder().lastName("").company("")
            .leadStatus("").firstName("")
            .build();
            }
}

