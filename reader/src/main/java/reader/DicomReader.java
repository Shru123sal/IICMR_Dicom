package reader;

import org.dcm4che3.data.Tag;

public class DicomReader implements IDicomReader{

	DicomReaderHelper reader=null;


	public static void main(String args[])
	{

	}

	public DicomReader(String filePath)
	{
		reader=new DicomReaderHelper(filePath);
	}


	public String getPatientName()
	{
		return reader.getPatientName(Tag.PatientBirthName);	
	}





	public String getPatientID() {
		// TODO Auto-generated method stub
		return reader.getPatientID(Tag.PatientID);	
	}

	public String getPatientDOB() {
		// TODO Auto-generated method stub
		return reader.getPatientDOB(Tag.PatientBirthDate);	
	}

	public String getPatientWeight() {
		// TODO Auto-generated method stub
		return reader.getPatientWeight(Tag.PatientWeight);	
	}

	public String getPatientSex() {
		// TODO Auto-generated method stub
		return reader.getPatientSex(Tag.PatientSex);	
	}

	public String getStudyDescription() {
		// TODO Auto-generated method stub
		return reader.getStudyDescription(Tag.StudyDescription);	
	}

	public String getStudyProtocolName() {
		// TODO Auto-generated method stub
		return reader.getStudyProtocolName(Tag.ProtocolName);	
	}

	public String getStudyDate() {
		// TODO Auto-generated method stub
		return reader.getStudyDate(Tag.StudyDate);	
	}

	public String getStudyTime() {
		// TODO Auto-generated method stub
		return reader.getStudyTime(Tag.StudyTime);	
	}

	public String getStudyId() {
		// TODO Auto-generated method stub
		return reader.getStudyId(Tag.StudyID);	
	}

	public String getImagetype() {
		// TODO Auto-generated method stub
		return reader.getImagetype(Tag.ImageType);	
	}

	public String getEquiptmentModel() {
		// TODO Auto-generated method stub
		return reader.getEquiptmentModel(Tag.ManufacturerModelName);	
	}

	public String getEquiptmentManufacturer() {
		// TODO Auto-generated method stub
		return reader.getEquiptmentManufacturer(Tag.Manufacturer);	
	}

	public String getInstitutionName() {
		// TODO Auto-generated method stub
		return reader.getInstitutionName(Tag.InstitutionName);	
	}

	public String getOperatorsName() {
		// TODO Auto-generated method stub
		return reader.getOperatorsName(Tag.OperatorsName);	
	}

	public String getNameofPhysician() {
		// TODO Auto-generated method stub
		return reader.getNameofPhysician(Tag.NameOfPhysiciansReadingStudy);	
	}

	public String getAllergies() {
		// TODO Auto-generated method stub
		return reader.getAllergies(Tag.Allergies);	
	}

	public String getCountryofResidence() {
		// TODO Auto-generated method stub
		return reader.getCountryofResidence(Tag.CountryOfResidence);	
	}

	public String getPatientTelephoneNumbers() {
		// TODO Auto-generated method stub
		return reader.getPatientTelephoneNumbers(Tag.PatientTelephoneNumbers);	
	}

	public String getSmokingStatus() {
		// TODO Auto-generated method stub
		return reader.getSmokingStatus(Tag.PregnancyStatus);	
	}

	public String getPregnancyStatus() {
		// TODO Auto-generated method stub
		return reader.getPregnancyStatus(Tag.LastMenstrualDate);	
	}

	public String getLastMenstrualDate() {
		// TODO Auto-generated method stub
		return reader.getLastMenstrualDate(Tag.PatientOrientation);	
	}

	public String getPatientOrientation() {
		// TODO Auto-generated method stub
		return reader.getPatientOrientation(Tag.PhotometricInterpretation);	
	}

	public Object getImagePhotometricInformation() {
		// TODO Auto-generated method stub
		return reader.getImagePhotometricInformation(Tag.CineRate);	
	}

	public Object getCRData() {
		// TODO Auto-generated method stub
		return reader.getCRData(Tag.CatchTrialsDataFlag);	
	}

	public Object getCTData() {
		// TODO Auto-generated method stub
		return reader.getCTData(Tag.MRAcquisitionType);	
	}

	public Object getMRData() {
		// TODO Auto-generated method stub
		return reader.getMRData(Tag.MRAcquisitionType);	
	}

	public Object getXrayAnalogData() {
		// TODO Auto-generated method stub
		return reader.getXrayAnalogData(Tag.XRayImageReceptorTranslation);	
	}

	public Object getXrayRadioData() {
		// TODO Auto-generated method stub
		return reader.getXrayRadioData(Tag.XRayGeometrySequence);	
	}

	public Object getRTData() {
		// TODO Auto-generated method stub
		return reader.getRTData(Tag.RadiationType);	
	}

	public Object getMammographyData() {
		// TODO Auto-generated method stub
		return reader.getMammographyData(Tag.MaxDensity);	
	}

	public Object getVLData() {
		// TODO Auto-generated method stub
		return reader.getVLData(Tag.VolumeLocalizationTechnique);	
	}

	public Object getRadiofluoroData() {
		// TODO Auto-generated method stub
		return reader.getRadiofluoroData(Tag.FluoroscopyFlag);	
	}

	public Object getSurfaceSegmentation() {
		// TODO Auto-generated method stub
		return reader.getSurfaceSegmentation(Tag.SegmentSurfaceGenerationAlgorithmIdentificationSequence);	
	}

	public Object getAllData() {
		// TODO Auto-generated method stub
		return reader.getAllData(Tag.PatientSupportType);	
	}
}

