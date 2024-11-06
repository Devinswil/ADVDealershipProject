package com.pluralsight;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class ContractDataManager {
    private static final String FILE_NAME1 = "contracts.csv";

    public static void saveContract(Contract contract) {
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(FILE_NAME1, true));
            if (contract instanceof SalesContract) {
                br.write("Sales Contract: ");
                br.write(contract.getDateOfContract() + "|");
                br.write(contract.getCustomerName() + "|");
                br.write(contract.getCustomerEmail() + "|");
                br.write(contract.vehicleSold.getVin() + "|");
                br.write(contract.vehicleSold.getYear() + "|");
                br.write(contract.vehicleSold.getMake() + "|");
                br.write(contract.vehicleSold.getModel() + "|");
                br.write(contract.vehicleSold.getVehicleType() + "|");
                br.write(contract.vehicleSold.getColor() + "|");
                br.write(contract.vehicleSold.getOdometer() + "|");
                br.write(contract.vehicleSold.getPrice() + "|");
                br.write(((SalesContract) contract).getSalesTaxAmount() + "|");
                br.write(((SalesContract) contract).getRecordingFee() + "|");
                br.write(((SalesContract) contract).getProcessingFee() + "|");
                br.write(contract.getTotalPrice() + "|");
                br.write(contract.getMonthlyPayment() + "|");
            } else if (contract instanceof LeaseContract) {
                br.write("Sales Contract: ");
                br.write(contract.getDateOfContract() + "|");
                br.write(contract.getCustomerName() + "|");
                br.write(contract.getCustomerEmail() + "|");
                br.write(contract.vehicleSold.getVin() + "|");
                br.write(contract.vehicleSold.getYear() + "|");
                br.write(contract.vehicleSold.getMake() + "|");
                br.write(contract.vehicleSold.getModel() + "|");
                br.write(contract.vehicleSold.getVehicleType() + "|");
                br.write(contract.vehicleSold.getColor() + "|");
                br.write(contract.vehicleSold.getOdometer() + "|");
                br.write(contract.vehicleSold.getPrice() + "|");
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
