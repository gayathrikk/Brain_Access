package com.test.Brain_Access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Testing {
    
    @Test
    public void testDB() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        String url = "jdbc:mysql://private.colab.humanbrain.in:3306/HBA_V2";
        String username = "root";
        String password = "Health#123";
        Connection connection = DriverManager.getConnection(url, username, password);
        System.out.println("MYSQL database connect");
        
        // Users
        int[] userIDs = {36, 89, 90, 91, 92, 93, 94, 95, 96, 97, 109, 110};

        for (int userID : userIDs) {
            executeAndPrintQuery(connection, userID);
        }

        // Close the connection
        connection.close();
        user36_API();
        user89_API();
        user90_API();
        user91_API();
        user92_API();
        user93_API();
        user94_API();
        user95_API();
        user96_API();
        user97_API();
        user109_API();
        user110_API();
    }

    private void executeAndPrintQuery(Connection connection, int userID) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT a.user_id, b.user_name, a.seriesset_id " +
                       "FROM `User_Brain` as a LEFT JOIN `CC_User` as b ON(a.user_id = b.id) " +
                       "WHERE a.user_id=" + userID;

        ResultSet resultSet = statement.executeQuery(query);
        System.out.println("User-" + userID);
        while (resultSet.next()) {
            Integer user_id = resultSet.getInt("user_id");
            String seriesset_id = resultSet.getString("seriesset_id");
            String user_name = resultSet.getString("user_name");
            System.out.println("user_id: " + user_id + "-----User_name:" + user_name + "----- seriesset_id: " + seriesset_id);
        }

        // Close the statement
        resultSet.close();
        statement.close();
        
        
    }

	  private void user36_API()
	    {	
	    	//series set
	    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/102224288973418834869");
	         int statusCode = response.getStatusCode();
	         if (statusCode == 200) {
	             System.out.println("API request to the series set of user-36 passed. Status code: " + statusCode);
	         } else {
	             System.out.println("API request to the series set of user-36 failed. Status code: " + statusCode);
	         }
	         Assert.assertEquals(statusCode, 200, "API request to the series set of user-36 failed");
	    }
	         
	         private void user89_API()
	 	    {	
	 	    	//series set
	 	    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/456123789");
	 	         int statusCode = response.getStatusCode();
	 	         if (statusCode == 200) {
	 	             System.out.println("API request to the series set of user-89 passed. Status code: " + statusCode);
	 	         } else {
	 	             System.out.println("API request to the series set of user-89 failed. Status code: " + statusCode);
	 	         }
	 	         Assert.assertEquals(statusCode, 200, "API request to the series set of user-89 failed");
	 	    }
	 	         
	 	        private void user90_API()
	 		    {	
	 		    	//series set
	 		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/258974613");
	 		         int statusCode = response.getStatusCode();
	 		         if (statusCode == 200) {
	 		             System.out.println("API request to the series set of user-90 passed. Status code: " + statusCode);
	 		         } else {
	 		             System.out.println("API request to the series set of user-90 failed. Status code: " + statusCode);
	 		         }
	 		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-90 failed");
	 		    }    
	 	        
	 	       private void user91_API()
	 		    {	
	 		    	//series set
	 		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/1234");
	 		         int statusCode = response.getStatusCode();
	 		         if (statusCode == 200) {
	 		             System.out.println("API request to the series set of user-91 passed. Status code: " + statusCode);
	 		         } else {
	 		             System.out.println("API request to the series set of user-91 failed. Status code: " + statusCode);
	 		         }
	 		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-91 failed");
	 		    }   
	 	       
	 	      private void user92_API()
	 		    {	
	 		    	//series set
	 		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/897456153");
	 		         int statusCode = response.getStatusCode();
	 		         if (statusCode == 200) {
	 		             System.out.println("API request to the series set of user-92 passed. Status code: " + statusCode);
	 		         } else {
	 		             System.out.println("API request to the series set of user-92 failed. Status code: " + statusCode);
	 		         }
	 		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-92 failed");
	 		    } 
	 	      
	 	     private void user93_API()
	 		    {	
	 		    	//series set
	 		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/965412387");
	 		         int statusCode = response.getStatusCode();
	 		         if (statusCode == 200) {
	 		             System.out.println("API request to the series set of user-93 passed. Status code: " + statusCode);
	 		         } else {
	 		             System.out.println("API request to the series set of user-93 failed. Status code: " + statusCode);
	 		         }
	 		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-93 failed");
	 		    } 
	 	    private void user94_API()
 		    {	
 		    	//series set
 		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/564123987");
 		         int statusCode = response.getStatusCode();
 		         if (statusCode == 200) {
 		             System.out.println("API request to the series set of user-94 passed. Status code: " + statusCode);
 		         } else {
 		             System.out.println("API request to the series set of user-94 failed. Status code: " + statusCode);
 		         }
 		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-94 failed");
 		    }
	 	   private void user95_API()
		    {	
		    	//series set
		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/756321498");
		         int statusCode = response.getStatusCode();
		         if (statusCode == 200) {
		             System.out.println("API request to the series set of user-95 passed. Status code: " + statusCode);
		         } else {
		             System.out.println("API request to the series set of user-95 failed. Status code: " + statusCode);
		         }
		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-95 failed");
		    }
	 	   
	 	  private void user96_API()
		    {	
		    	//series set
		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/378945612");
		         int statusCode = response.getStatusCode();
		         if (statusCode == 200) {
		             System.out.println("API request to the series set of user-96 passed. Status code: " + statusCode);
		         } else {
		             System.out.println("API request to the series set of user-96 failed. Status code: " + statusCode);
		         }
		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-96 failed");
		    }
	 	 private void user97_API()
		    {	
		    	//series set
		    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/104132314979673418887");
		         int statusCode = response.getStatusCode();
		         if (statusCode == 200) {
		             System.out.println("API request to the series set of user-97 passed. Status code: " + statusCode);
		         } else {
		             System.out.println("API request to the series set of user-97 failed. Status code: " + statusCode);
		         }
		         Assert.assertEquals(statusCode, 200, "API request to the series set of user-97 failed");
		    }
	 	private void user109_API()
	    {	
	    	//series set
	    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/118046913671872779951");
	         int statusCode = response.getStatusCode();
	         if (statusCode == 200) {
	             System.out.println("API request to the series set of user-109 passed. Status code: " + statusCode);
	         } else {
	             System.out.println("API request to the series set of user-109 failed. Status code: " + statusCode);
	         }
	         Assert.assertEquals(statusCode, 200, "API request to the series set of user-109 failed");
	    }
	 	private void user110_API()
	    {	
	    	//series set
	    	 Response response = RestAssured.get("https://dataportal.colab.humanbrain.in/CC/getDetailsOfSeriesStatsAllRestricted/897456321");
	         int statusCode = response.getStatusCode();
	         if (statusCode == 200) {
	             System.out.println("API request to the series set of user-110 passed. Status code: " + statusCode);
	         } else {
	             System.out.println("API request to the series set of user-110 failed. Status code: " + statusCode);
	         }
	         Assert.assertEquals(statusCode, 200, "API request to the series set of user-110 failed");
	    }
	 	   
	 	     
}

