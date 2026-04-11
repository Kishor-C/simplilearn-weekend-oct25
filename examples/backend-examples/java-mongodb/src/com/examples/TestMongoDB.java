package com.examples;

import org.bson.Document;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestMongoDB {

	public static void main(String[] args) {
		String url = "mongodb://127.0.0.1:27017";
		// connects to the mongodb-server
		MongoClient client = MongoClients.create(url);
		// accessing the database
		MongoDatabase database = client.getDatabase("mydb");
		// get the collection - use org.bson.Document
		MongoCollection<Document> collection = database.getCollection("students");
		
		// CRUD operation
		
		// reading all the documents and print in JSON format
		for(Document document : collection.find()) {
			System.out.println(document.toJson());
		}
		
		// insert a document - create a document - append stores key & value
		Document student = new Document().append("name", "Student3")
				.append("age", 20);
		// insertOne from collection
		collection.insertOne(student);
		
		// try updateOne and deleteOne
	}

}
