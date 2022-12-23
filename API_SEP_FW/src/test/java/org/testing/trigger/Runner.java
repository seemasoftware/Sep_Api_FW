package org.testing.trigger;

import java.io.IOException;

import org.testing.testCases.TC10_DeleteRequest2;
import org.testing.testCases.TC1_PostRequest;
import org.testing.testCases.TC2_GetAllRequest;
import org.testing.testCases.TC3_GetParticularRecord;
import org.testing.testCases.TC4_PutRequest;
import org.testing.testCases.TC5_DeleteRequest;
import org.testing.testCases.TC6_PostRequest2;
import org.testing.testCases.TC7_GetAllRequest2;
import org.testing.testCases.TC8_GetParticularRecord2;
import org.testing.testCases.TC9_PutRequest2;

public class Runner {
	
	public static void main(String[] args) throws IOException {
	

	TC1_PostRequest tc1 = new TC1_PostRequest();
	tc1.testcase1();
	
	TC2_GetAllRequest tc2 = new TC2_GetAllRequest();
	tc2.testcase2();
	
	TC3_GetParticularRecord tc3 = new TC3_GetParticularRecord();
	tc3.testcase3();
	
	TC4_PutRequest tc4 =new  TC4_PutRequest();
	tc4.testcase4();
	
	TC5_DeleteRequest tc5 = new TC5_DeleteRequest();
	tc5.testcase5();
	
	TC6_PostRequest2 tc6 = new TC6_PostRequest2();
	tc6.testcase6();
	
	TC7_GetAllRequest2 tc7 = new TC7_GetAllRequest2();
	tc7.testcase7();
	
	TC8_GetParticularRecord2 tc8 = new TC8_GetParticularRecord2();
	tc8.testcase8();
	
	TC9_PutRequest2 tc9 =new  TC9_PutRequest2();
	tc9.testcase9();
	
	TC10_DeleteRequest2 tc10 = new TC10_DeleteRequest2();
	tc10.testcase10();
}
}