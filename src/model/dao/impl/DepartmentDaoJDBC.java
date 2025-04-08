package model.dao.impl;

import db.DbException;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class DepartmentDaoJDBC implements DepartmentDao {
    private Connection conn;

    public DepartmentDaoJDBC(Connection conn) {
        this.conn = conn;
    }

    @Override
    public void insert(Department obj) {

    }

    @Override
    public void update(Department obj) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public Department findById(Integer id) {
        PreparedStatement st = null;
        ResultSet rs =null;
        try{
            st =conn.prepareStatement(
                    "SELECT * FROM department WHERE Id = ?");

            st.setInt(1, id);

            rs = st.executeQuery();
            if(rs.next()){
                Department dep = instanceateDepartment(rs);
                return dep;
            }
            return null;

        }catch (SQLException e){
            throw new DbException(e.getMessage());
        }
    }

    private Department instanceateDepartment(ResultSet rs) throws SQLException {
        Department dep = new Department();

        dep.setId(rs.getInt("Id"));
        dep.setName(rs.getString("Name"));

        return dep;
    }
    @Override
    public List<Department> findall() {
        return List.of();
    }
}
