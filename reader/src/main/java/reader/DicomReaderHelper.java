package reader;
import java.io.File;

import org.dcm4che2.data.DicomObject;
import org.dcm4che2.data.Tag;
import org.dcm4che2.io.DicomInputStream;
import org.dcm4che3.data.Attributes;

class DicomReaderHelper 

{
	DicomObject object = null;
	
	public DicomReaderHelper() {
		
	}
	public DicomReaderHelper(String filePath)
	{
		try {
			DicomInputStream dis = new DicomInputStream(new File(filePath));
			object = dis.readDicomObject();
			dis.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
	
	public String getPatientName(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientName);
	}
	public String getPatientID(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientID);
	}
	public String getPatientDOB(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientBirthDate);
	}
	public String getPatientWeight(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientWeight);
	}
	public String getPatientSex(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientSex);
	}
	public String getStudyDescription(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.StudyDescription);
	}
	public String getStudyProtocolName(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.ProtocolName);
	}
	public String getStudyDate(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.StudyDate);
	}
	public String getStudyTime(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.StudyTime);
	}
	public String getStudyId(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.StudyID);
	}
	public String getImagetype(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.ImageType);
	}
	public String getEquiptmentModel(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.ManufacturerModelName);
	}
	public String getEquiptmentManufacturer(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.Manufacturer);
	}
	public String getInstitutionName(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.InstitutionName);
	}
	public String getOperatorsName(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.OperatorsName);
	}
	public String getNameofPhysician(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.NameOfPhysiciansReadingStudy);
	}
	public String getAllergies(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.Allergies);
	}
	public String getCountryofResidence(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.CountryOfResidence);
	}
	public String getPatientTelephoneNumbers(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientTelephoneNumbers);
	}
	public String getSmokingStatus(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.SmokingStatus);
	}
	public String getPregnancyStatus(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PregnancyStatus);
	}
	public String getLastMenstrualDate(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.LastMenstrualDate);
	}
	public String getPatientOrientation(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientOrientation);
	}
	public Object getImagePhotometricInformation(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PhotometricInterpretation);
	}
	public Object getCRData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.CineRate);
	}
	public Object getCTData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.CatchTrialsDataFlag);
	}
	public Object getMRData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.MRAcquisitionType);
	}
	public Object getXrayAnalogData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.XRayImageReceptorTranslation);
	}
	public Object getXrayRadioData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.XRayGeometrySequence);
	}
	public Object getRTData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.RadiationType);
	}
	public Object getMammographyData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.MaxDensity);
	}
	public Object getVLData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.VolumeLocalizationTechnique);
	}
	public Object getRadiofluoroData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.FluoroscopyFlag);
	}
	public Object getSurfaceSegmentation(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.SegmentSurfaceGenerationAlgorithmIdentificationSequence);
	}
	public Object getAllData(int tag) {
		// TODO Auto-generated method stub
		return object.getString(Tag.PatientSupportType);
	}	
}