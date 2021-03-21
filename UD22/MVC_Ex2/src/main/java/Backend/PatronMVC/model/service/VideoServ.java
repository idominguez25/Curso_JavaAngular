package Backend.PatronMVC.model.service;

import java.util.LinkedList;

import javax.swing.JOptionPane;

import Backend.PatronMVC.controller.Controller;
import Backend.PatronMVC.model.dao.VideoDao;
import Backend.PatronMVC.model.dto.Video;

public class VideoServ {
private Controller videoController;
	
	
	public void setController(Controller videoController) {
		this.setController(videoController);
	}
	
	public void validarRegistro(Video video) {
		VideoDao videoDao;
		
		if(video.getTitulo().length() > 3) {
			videoDao = new VideoDao();
			videoDao.insertarVideo(video);
		} else
			JOptionPane.showMessageDialog(null, "El titulo debe tener más de 3 caracteres", "Advertencia",
					JOptionPane.WARNING_MESSAGE);
	}
	
	public Video validarConsulta(String id) {
		VideoDao videoDao;
		Video video = null;
		
		try {
			videoDao = new VideoDao();
			video = videoDao.buscarVideo(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debe ingresar un dato numerico", "Error", JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}

		return video;
	}
	
	
	public LinkedList<Video> getAllVideo(){
		LinkedList<Video> listaVideos = new LinkedList<>();
		
		try {
			listaVideos = new VideoDao().getAllVideo();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Se ha presentado un Error", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		return listaVideos;
	}
	
	//Getters y setters del videoControllador
	public Controller getVideoController() {
		return videoController;
	}

	public void setVideoController(Controller videoController) {
		this.videoController = videoController;
	}
}
