package com.examples.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.examples.model.Participant;

public class ParticipantDAO {
	// we must implement CRUD operations here
	
	public int addParticipant(Participant participant) {
		int status = 0;
		try {
			Connection connection = DBUtil.getConnection();
			String query = "insert into participants(participant_name, participant_phone, batch_id_ref) values(?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			statement.setString(1, participant.getParticipantName());
			statement.setLong(2, participant.getPhone());
			statement.setInt(3, participant.getBatchId());
			status = statement.executeUpdate();
			statement.close();
			connection.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
		return status;
	}
	// implement other operations
}
