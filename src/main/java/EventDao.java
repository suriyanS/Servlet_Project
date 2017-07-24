    import java.util.*;  
    import java.sql.*;  
      
    public class EventDao {  
      
        public static Connection getConnection(){  
            Connection con=null;  
            try{  
                Class.forName("com.mysql.jdbc.Driver");  
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/event_form", "root", "");  
            }catch(Exception e){System.out.println(e);}  
            return con;  
        }  
        public static int save(pojoEvent e){  
            int status=0;  
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                              "insert into eventform(firstname,lastname,email,date,time,topic,location) values(?,?,?,?,?,?,?)");  
                ps.setString(1,e.getFirstName());  
                ps.setString(2,e.getLastName());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getDate());  
                ps.setString(5,e.getTime()); 
                ps.setString(6,e.getTopic()); 
                ps.setString(7,e.getLocation()); 
               
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int update(pojoEvent e){  
            int status=0;  
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement(  
                             "update eventform set firstname=?,lastname=?,email=?,date=?,time=?,topic=?,location=? where id=?");  
                 ps.setString(1,e.getFirstName());  
                ps.setString(2,e.getLastName());  
                ps.setString(3,e.getEmail());  
                ps.setString(4,e.getDate());  
                ps.setString(5,e.getTime()); 
                ps.setString(6,e.getTopic()); 
                ps.setString(7,e.getLocation());   
                ps.setInt(8,e.getId());  
                  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return status;  
        }  
        public static int delete(int id){  
            int status=0;  
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("delete from eventform where id=?");  
                ps.setInt(1,id);  
                status=ps.executeUpdate();  
                  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return status;  
        }  
        public static pojoEvent getUsersById(int id){  
            pojoEvent e=new pojoEvent();  
              
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from eventform where id=?");  
                ps.setInt(1,id);  
                ResultSet rs=ps.executeQuery();  
                if(rs.next()){  
                    e.setId(rs.getInt(1));  
                    e.setFirstName(rs.getString(2));  
                    e.setLastName(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setDate(rs.getString(5));
                    e.setTime(rs.getString(6)); 
                    e.setTopic(rs.getString(7));   
                    e.setLocation(rs.getString(8));    
                }  
                con.close();  
            }catch(Exception ex){ex.printStackTrace();}  
              
            return e;  
        }  
        public static List<pojoEvent> getAllUsers(){  
            List<pojoEvent> list=new ArrayList<pojoEvent>();  
              
            try{  
                Connection con=EventDao.getConnection();  
                PreparedStatement ps=con.prepareStatement("select * from eventform");  
                ResultSet rs=ps.executeQuery();  
                while(rs.next()){  
                   pojoEvent e=new pojoEvent();  
                    e.setId(rs.getInt(1));  
                    e.setFirstName(rs.getString(2));  
                    e.setLastName(rs.getString(3));  
                    e.setEmail(rs.getString(4));  
                    e.setDate(rs.getString(5));
                    e.setTime(rs.getString(6)); 
                    e.setTopic(rs.getString(7));   
                    e.setLocation(rs.getString(8)); 
                    list.add(e);  
                }  
                con.close();  
            }catch(Exception e){e.printStackTrace();}  
              
            return list;  
        }  
    }  