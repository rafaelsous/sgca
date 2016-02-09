package com.rafaelsousa.jpa.util;

import java.util.Map;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.export.OutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

public class GeradorDeRelatorios {
	
	/*private Connection conn = new ConnectionFactory.getConnection();
	
	public GeradorDeRelatorios(Connection conn) {
		this.conn = conn;
	}*/
	
	public void gerarPdf(String jrxml, Map<String, Object> parametros, OutputStreamExporterOutput saida) {
		try {
			//compila jrxml em memória
			JasperReport jasper = JasperCompileManager.compileReport(jrxml);
			
			//preenche o relatório
			//JasperPrint print = JasperFillManager.fillReport(jasper, parametros, conn);
			
			//exporta para PDF
			JRPdfExporter exporter = new JRPdfExporter();
			//exporter.setExporterInput(new SimpleExporterInput(print));
			exporter.setExporterOutput(saida);

			SimplePdfExporterConfiguration conf = new SimplePdfExporterConfiguration();
			exporter.setConfiguration(conf);
			exporter.exportReport();
		} catch (Exception e) {
			throw new RuntimeException("Erro ao gerar relatório", e);
		}
	}
	
}
