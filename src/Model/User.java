/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Database.Koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author MFI
 */
public class User {

    private Integer id;
    private String username;
    private String password;
    private List<HistoryGrooming> historyGroomingList;
    private List<HistoryPenitipan> historyPenitipanList;
    private List<Hewan> hewanList;
    
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public User(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<HistoryGrooming> getHistoryGroomingList() {
        return historyGroomingList;
    }

    public void setHistoryGroomingList(List<HistoryGrooming> historyGroomingList) {
        this.historyGroomingList = historyGroomingList;
    }

    public List<HistoryPenitipan> getHistoryPenitipanList() {
        return historyPenitipanList;
    }

    public void setHistoryPenitipanList(List<HistoryPenitipan> historyPenitipanList) {
        this.historyPenitipanList = historyPenitipanList;
    }

    public List<Hewan> getHewanList() {
        return hewanList;
    }

    public void setHewanList(List<Hewan> hewanList) {
        this.hewanList = hewanList;
    }
    
}
