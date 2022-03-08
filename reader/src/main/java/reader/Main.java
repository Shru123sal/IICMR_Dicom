package reader;

import org.dcm4che2.data.Tag;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DicomReader dicm=new DicomReader("D:\\Ziroh\\reader\\reader\\Image\\19997");

		System.out.println("Patient Name                 :" +dicm.getPatientName());
		System.out.println("Patient ID                   :" +dicm.getPatientID());
		System.out.println("Patient DOB                  :" +dicm.getPatientDOB());
		System.out.println("Patient Weight               :" +dicm.getPatientWeight());
		System.out.println("Patient Gender               :" +dicm.getPatientSex());
		System.out.println("Study Description            :" +dicm.getStudyDescription());
		System.out.println("Study ProtocolName           :" +dicm.getStudyProtocolName());
		System.out.println("Study Date                   :" +dicm.getStudyDate());
		System.out.println("Study Time                   :" +dicm.getStudyTime());
		System.out.println("Study Id                     :" +dicm.getStudyId());
		System.out.println("Imagetype                    :" +dicm.getImagetype());
		System.out.println("Equiptment Model             :" +dicm.getEquiptmentModel());
		System.out.println("Equiptment Manufacturer      :" +dicm.getEquiptmentManufacturer());
		System.out.println("Institution Name             :" +dicm.getInstitutionName());
		System.out.println("Operators Name               :" +dicm.getOperatorsName());
		System.out.println("Name of Physician            :" +dicm.getNameofPhysician());
		System.out.println("Allergies                    :" +dicm.getAllergies());
		System.out.println("Country of Residence         :" +dicm.getCountryofResidence());
		System.out.println("Patient TelephoneNumbers     :" +dicm.getPatientTelephoneNumbers());
		System.out.println("Smoking Status               :" +dicm.getSmokingStatus());
		System.out.println("Pregnancy Status             :" +dicm.getPregnancyStatus());
		System.out.println("Last Menstrual Date          :" +dicm.getLastMenstrualDate());
		System.out.println("Patient Orientation          :" +dicm.getPatientOrientation());
		System.out.println("Image Photometric Information:" +dicm.getImagePhotometricInformation());
		System.out.println("CRData                       :" +dicm.getCRData());
		System.out.println("CTData                       :" +dicm.getCTData());
		System.out.println("MRData                       :" +dicm.getMRData());
		System.out.println("Xray Analog Data             :" +dicm.getXrayAnalogData());
		System.out.println("Xray Radio Data              :" +dicm.getXrayRadioData());
		System.out.println("RTData                       :" +dicm.getRTData());
		System.out.println("Mammography Data             :" +dicm.getMammographyData());
		System.out.println("VLData                       :" +dicm.getVLData());
		System.out.println("Radiofluoro Data             :" +dicm.getRadiofluoroData());
		System.out.println("Surface Segmentation         :" +dicm.getSurfaceSegmentation());
		System.out.println("All Data                     :" +dicm.getAllData());
	}

}
