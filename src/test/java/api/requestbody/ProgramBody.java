package api.requestbody;


import java.io.IOException;

import api.payload.ProgramPayload;
import api.utilities.RestUtils;

public class ProgramBody extends RestUtils{
	
	public static ProgramPayload PostBody() throws IOException {

		ProgramPayload.setProgramName(xlutils.getCellData("programpostdata", 1, 0));
		ProgramPayload.setProgramDescription(xlutils.getCellData("programpostdata", 1, 1));
		ProgramPayload.setProgramStatus(xlutils.getCellData("programpostdata", 1, 2));
		System.out.println("SUdhaprogrampayload"+ProgramPayload.toString());
		return ProgramPayload;

	}

}
