package co.edu.unbosque.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;

import co.edu.unbosque.model.Ventas;
import co.edu.unbosque.service.DrogueriaService;

@Controller
public class PdfController {
	
	@Autowired
	private DrogueriaService service;
	
	@GetMapping("/generarpdf")
	public ResponseEntity<ByteArrayResource> descargarPDFAgentesOperaciones() throws DocumentException {
		List<Ventas> ventas = service.listarVentas();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		Document document = new Document();
		PdfWriter.getInstance(document, outputStream);
		document.open();

		for (Ventas venta : ventas) {
			
			document.add(new Paragraph("ID: " + venta.getId()));
			document.add(new Paragraph("Fecha: " + venta.getSede()));
			document.add(new Paragraph("Placa: " + venta.getCategoria()));
			document.add(new Paragraph("Ubicación: " + venta.getProducto()));
			document.add(new Paragraph("Dueño: " + venta.getPrecio()));
			document.add(new Paragraph("------------------------------------"));
			}

		document.close();

		byte[] pdfBytes = outputStream.toByteArray();

		HttpHeaders headers = new HttpHeaders();
		headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=generarpdf.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
				.contentLength(pdfBytes.length).body(new ByteArrayResource(pdfBytes));
	}

}
