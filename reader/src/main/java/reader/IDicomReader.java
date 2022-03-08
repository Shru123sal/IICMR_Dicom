package reader;

	public interface IDicomReader {
	    String getPatientName();
		String getPatientID();
		String getPatientDOB();
		String getPatientWeight();
		String getPatientSex();
		String getStudyDescription();
		String getStudyProtocolName();
		String getStudyDate();
		String getStudyTime();
		String getStudyId();
		String getImagetype();
		String getEquiptmentModel();
		String getEquiptmentManufacturer();
		String getInstitutionName();
		String getOperatorsName();
		String getNameofPhysician();
		String getAllergies();
		String getCountryofResidence();
		String getPatientTelephoneNumbers();
		String getSmokingStatus();
		String getPregnancyStatus();
		String getLastMenstrualDate();
		String getPatientOrientation();
		Object getImagePhotometricInformation();
		Object getCRData();
		Object getCTData();
		Object getMRData();
		Object getXrayAnalogData();
		Object getXrayRadioData();
		Object getRTData();
		Object getMammographyData();
		Object getVLData();
		Object getRadiofluoroData();
		Object getSurfaceSegmentation();
		Object getAllData();

	}
	
	

