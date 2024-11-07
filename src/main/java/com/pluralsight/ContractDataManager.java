package com.pluralsight;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ContractDataManager {
    private static final String FILE_NAME1 = "contracts.csv";

    public void saveContract(Contract contract) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(FILE_NAME1, true));
            if (contract instanceof SalesContract) {
                br.write("SALES");
                br.write(contract.getDateOfContract() + "|");
                br.write(contract.getCustomerName() + "|");
                br.write(contract.getCustomerEmail() + "|");
                br.write(contract.getVehicleSold().getVin() + "|");
                br.write(contract.getVehicleSold().getYear() + "|");
                br.write(contract.getVehicleSold().getMake() + "|");
                br.write(contract.getVehicleSold().getModel() + "|");
                br.write(contract.getVehicleSold().getVehicleType() + "|");
                br.write(contract.getVehicleSold().getColor() + "|");
                br.write(contract.getVehicleSold().getOdometer() + "|");
                br.write(contract.getVehicleSold().getPrice() + "|");
                br.write(((SalesContract) contract).getSalesTaxAmount() + "|");
                br.write(((SalesContract) contract).getRecordingFee() + "|");
                br.write(((SalesContract) contract).getProcessingFee() + "|");
                br.write(contract.getTotalPrice() + "|");
                br.write(contract.getMonthlyPayment() + "|");
            } else if (contract instanceof LeaseContract) {
                br.write("LEASE");
                br.write(contract.getDateOfContract() + "|");
                br.write(contract.getCustomerName() + "|");
                br.write(contract.getCustomerEmail() + "|");
                br.write(contract.getVehicleSold().getVin() + "|");
                br.write(contract.getVehicleSold().getYear() + "|");
                br.write(contract.getVehicleSold().getMake() + "|");
                br.write(contract.getVehicleSold().getModel() + "|");
                br.write(contract.getVehicleSold().getVehicleType() + "|");
                br.write(contract.getVehicleSold().getColor() + "|");
                br.write(contract.getVehicleSold().getOdometer() + "|");
                br.write(contract.getVehicleSold().getPrice() + "|");
                br.write(((LeaseContract) contract).getExpectedEndingValue() + "|");
                br.write(((LeaseContract) contract).getLeaseFee()+ "|");
                br.write(contract.getTotalPrice() + "|");
                br.write(contract.getMonthlyPayment() + "|");


            }

        } catch (IOException e) {
            System.err.println("Error writing to file");;
        }
    }

}
