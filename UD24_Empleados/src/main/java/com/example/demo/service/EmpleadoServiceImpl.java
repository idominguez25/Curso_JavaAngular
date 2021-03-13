package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IEmpleadoDAO;
import com.example.demo.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	IEmpleadoDAO iEmpleadoDao;

	@Override
	public List<Empleado> listarEmpleado() {
		return iEmpleadoDao.findAll();
	}

	@Override
	public Empleado añadirEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public Empleado getOneEmpleado(Integer id) {
		return iEmpleadoDao.findById(id).get();
	}

	@Override
	public Empleado actualizarEmpleado(Empleado empleado) {
		return iEmpleadoDao.save(empleado);
	}

	@Override
	public void eliminarEmpleado(Integer id) {
		iEmpleadoDao.deleteById(id);
	}

	@Override
	public List<Empleado> listarEmpleadoXTrabajo(String trabajo) {
		return iEmpleadoDao.findByTrabajo(trabajo);
	}

	
}