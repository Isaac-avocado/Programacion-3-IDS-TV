import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Canvas;
import java.awt.List;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JCheckBox;

public class examen_Unidad_3 {

	private JFrame frmFacturaEnJava;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTable table;
	private JTextField textFieldDescuento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					examen_Unidad_3 window = new examen_Unidad_3();
					window.frmFacturaEnJava.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public examen_Unidad_3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmFacturaEnJava = new JFrame();
		frmFacturaEnJava.setBackground(new Color(255, 255, 255));
		frmFacturaEnJava.getContentPane().setBackground(new Color(255, 255, 255));
		frmFacturaEnJava.getContentPane().setForeground(new Color(255, 255, 255));
		frmFacturaEnJava.setTitle("Factura en java");
		frmFacturaEnJava.setResizable(false);
		frmFacturaEnJava.setBounds(100, 100, 550, 560);
		frmFacturaEnJava.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFacturaEnJava.getContentPane().setLayout(null);
		
		JPanel base = new JPanel();
		base.setBackground(new Color(255, 255, 255));
		base.setBounds(0, 0, 534, 521);
		frmFacturaEnJava.getContentPane().add(base);
		base.setLayout(null);
		
		JPanel titulo = new JPanel();
		titulo.setBackground(new Color(14, 103, 158));
		titulo.setForeground(new Color(14, 103, 158));
		titulo.setBounds(0, 0, 534, 71);
		base.add(titulo);
		titulo.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Factura en Java - NetBeans - ArrayList y POO");
		lblTitulo.setBackground(new Color(255, 255, 255));
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Calibri", Font.BOLD, 17));
		lblTitulo.setBounds(10, 11, 431, 25);
		titulo.add(lblTitulo);
		
		JLabel lblSubtitulo = new JLabel("[Sin Base de datos]");
		lblSubtitulo.setForeground(Color.WHITE);
		lblSubtitulo.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSubtitulo.setBackground(Color.WHITE);
		lblSubtitulo.setBounds(20, 33, 127, 20);
		titulo.add(lblSubtitulo);
		
		JPanel panelDatosDelCliente = new JPanel();
		panelDatosDelCliente.setBackground(new Color(255, 255, 255));
		panelDatosDelCliente.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos del cliente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDatosDelCliente.setBounds(10, 82, 514, 90);
		base.add(panelDatosDelCliente);
		panelDatosDelCliente.setLayout(null);
		
		JLabel lblDocumento_1 = new JLabel("Documento:");
		lblDocumento_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDocumento_1.setForeground(Color.BLACK);
		lblDocumento_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDocumento_1.setBackground(Color.WHITE);
		lblDocumento_1.setBounds(22, 29, 83, 20);
		panelDatosDelCliente.add(lblDocumento_1);
		
		JLabel lblDireccin_1 = new JLabel("Dirección:");
		lblDireccin_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblDireccin_1.setForeground(Color.BLACK);
		lblDireccin_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDireccin_1.setBackground(Color.WHITE);
		lblDireccin_1.setBounds(22, 59, 83, 20);
		panelDatosDelCliente.add(lblDireccin_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(102, 27, 144, 20);
		panelDatosDelCliente.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(102, 57, 144, 20);
		panelDatosDelCliente.add(textField_5);
		
		JLabel lblNombre_1 = new JLabel("Nombre:");
		lblNombre_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNombre_1.setForeground(Color.BLACK);
		lblNombre_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNombre_1.setBackground(Color.WHITE);
		lblNombre_1.setBounds(264, 29, 83, 20);
		panelDatosDelCliente.add(lblNombre_1);
		
		JLabel lblTelfono_1 = new JLabel("Teléfono:");
		lblTelfono_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelfono_1.setForeground(Color.BLACK);
		lblTelfono_1.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTelfono_1.setBackground(Color.WHITE);
		lblTelfono_1.setBounds(264, 59, 83, 20);
		panelDatosDelCliente.add(lblTelfono_1);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(344, 27, 144, 20);
		panelDatosDelCliente.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(344, 57, 144, 20);
		panelDatosDelCliente.add(textField_7);
		
		JPanel panelDatosDelCliente_1 = new JPanel();
		panelDatosDelCliente_1.setLayout(null);
		panelDatosDelCliente_1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Datos de factura", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDatosDelCliente_1.setBackground(Color.WHITE);
		panelDatosDelCliente_1.setBounds(10, 172, 514, 62);
		base.add(panelDatosDelCliente_1);
		
		JLabel lblNFactura = new JLabel("N° Factura:");
		lblNFactura.setHorizontalAlignment(SwingConstants.LEFT);
		lblNFactura.setForeground(Color.BLACK);
		lblNFactura.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblNFactura.setBackground(Color.WHITE);
		lblNFactura.setBounds(22, 29, 83, 20);
		panelDatosDelCliente_1.add(lblNFactura);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setHorizontalAlignment(SwingConstants.LEFT);
		lblFecha.setForeground(Color.BLACK);
		lblFecha.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblFecha.setBackground(Color.WHITE);
		lblFecha.setBounds(264, 29, 83, 20);
		panelDatosDelCliente_1.add(lblFecha);
		
		JLabel lblNFacturaR = new JLabel("1");
		lblNFacturaR.setHorizontalAlignment(SwingConstants.LEFT);
		lblNFacturaR.setForeground(Color.BLACK);
		lblNFacturaR.setFont(new Font("Calibri", Font.BOLD, 15));
		lblNFacturaR.setBackground(Color.WHITE);
		lblNFacturaR.setBounds(115, 29, 83, 20);
		panelDatosDelCliente_1.add(lblNFacturaR);
		
		JLabel lblFechaR = new JLabel("2021/05/21");
		lblFechaR.setHorizontalAlignment(SwingConstants.LEFT);
		lblFechaR.setForeground(Color.BLACK);
		lblFechaR.setFont(new Font("Calibri", Font.BOLD, 15));
		lblFechaR.setBackground(Color.WHITE);
		lblFechaR.setBounds(357, 30, 83, 20);
		panelDatosDelCliente_1.add(lblFechaR);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 238, 514, 40);
		base.add(panel);
		panel.setLayout(null);
		
		Canvas canvas_1_1 = new Canvas();
		canvas_1_1.setBackground(Color.WHITE);
		canvas_1_1.setBounds(11, 23, 20, 4);
		panel.add(canvas_1_1);
		
		Canvas canvas_1 = new Canvas();
		canvas_1.setBackground(new Color(255, 255, 255));
		canvas_1.setBounds(11, 15, 20, 4);
		panel.add(canvas_1);
		
		Canvas canvas = new Canvas();
		canvas.setBackground(new Color(14, 103, 158));
		canvas.setBounds(10, 10, 22, 22);
		panel.add(canvas);
		
		JLabel lblVerListado = new JLabel("Ver listado de facturas");
		lblVerListado.setHorizontalAlignment(SwingConstants.LEFT);
		lblVerListado.setForeground(Color.BLACK);
		lblVerListado.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblVerListado.setBackground(Color.WHITE);
		lblVerListado.setBounds(38, 12, 167, 20);
		panel.add(lblVerListado);
		
		JLabel lblAñadir = new JLabel("Eliminar");
		lblAñadir.setHorizontalAlignment(SwingConstants.LEFT);
		lblAñadir.setForeground(Color.BLACK);
		lblAñadir.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblAñadir.setBackground(Color.WHITE);
		lblAñadir.setBounds(421, 12, 83, 20);
		panel.add(lblAñadir);
		
		JLabel lblEliminar = new JLabel("Añadir");
		lblEliminar.setHorizontalAlignment(SwingConstants.LEFT);
		lblEliminar.setForeground(Color.BLACK);
		lblEliminar.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblEliminar.setBackground(Color.WHITE);
		lblEliminar.setBounds(302, 12, 83, 20);
		panel.add(lblEliminar);
		
		Canvas canvas_1_1_1 = new Canvas();
		canvas_1_1_1.setBackground(Color.WHITE);
		canvas_1_1_1.setBounds(275, 19, 20, 4);
		panel.add(canvas_1_1_1);
		
		Canvas canvas_1_2 = new Canvas();
		canvas_1_2.setBackground(Color.WHITE);
		canvas_1_2.setBounds(283, 11, 4, 20);
		panel.add(canvas_1_2);
		
		Canvas canvas_2 = new Canvas();
		canvas_2.setBackground(new Color(128, 255, 0));
		canvas_2.setBounds(274, 10, 22, 22);
		panel.add(canvas_2);
		
		Canvas canvas_1_1_2 = new Canvas();
		canvas_1_1_2.setBackground(Color.WHITE);
		canvas_1_1_2.setBounds(394, 19, 20, 4);
		panel.add(canvas_1_1_2);
		
		Canvas canvas_3 = new Canvas();
		canvas_3.setBackground(new Color(255, 0, 0));
		canvas_3.setBounds(393, 10, 22, 22);
		panel.add(canvas_3);
		
		table = new JTable();
		table.setBackground(new Color(255, 255, 255));
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Productoo", "Cantidad", "Valor", "Sub Total"},
				{"Agua", "2", "500", "1000.0"},
				{"Cereal", "5", "1000", "5000.0"},
				{"Leche", "2", "300", "600.0"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(90);
		table.getColumnModel().getColumn(1).setPreferredWidth(90);
		table.getColumnModel().getColumn(2).setPreferredWidth(90);
		table.getColumnModel().getColumn(3).setResizable(false);
		table.getColumnModel().getColumn(3).setPreferredWidth(90);
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(10, 278, 514, 90);
		base.add(table);
		
		JLabel lblSubTotal = new JLabel("SubTotal:");
		lblSubTotal.setHorizontalAlignment(SwingConstants.LEFT);
		lblSubTotal.setForeground(Color.BLACK);
		lblSubTotal.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblSubTotal.setBackground(Color.WHITE);
		lblSubTotal.setBounds(20, 379, 83, 20);
		base.add(lblSubTotal);
		
		JLabel lblDescuento = new JLabel("% Descuento:");
		lblDescuento.setHorizontalAlignment(SwingConstants.LEFT);
		lblDescuento.setForeground(Color.BLACK);
		lblDescuento.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblDescuento.setBackground(Color.WHITE);
		lblDescuento.setBounds(20, 410, 101, 20);
		base.add(lblDescuento);
		
		JLabel lblIVA = new JLabel("IVA 19%:");
		lblIVA.setHorizontalAlignment(SwingConstants.LEFT);
		lblIVA.setForeground(Color.BLACK);
		lblIVA.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblIVA.setBackground(Color.WHITE);
		lblIVA.setBounds(20, 441, 83, 20);
		base.add(lblIVA);
		
		JLabel lblTotalFactura = new JLabel("Total Factura:");
		lblTotalFactura.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalFactura.setForeground(Color.BLACK);
		lblTotalFactura.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblTotalFactura.setBackground(Color.WHITE);
		lblTotalFactura.setBounds(20, 472, 101, 20);
		base.add(lblTotalFactura);
		
		JButton btnCancelar = new JButton("Limpiar");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCancelar.setBounds(435, 487, 89, 23);
		base.add(btnCancelar);
		
		JButton btnFinalizarFactura = new JButton("Finalizar Factura");
		btnFinalizarFactura.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnFinalizarFactura.setBounds(300, 487, 125, 23);
		base.add(btnFinalizarFactura);
		
		JLabel lblSubTotalR = new JLabel("6600.0");
		lblSubTotalR.setHorizontalAlignment(SwingConstants.LEFT);
		lblSubTotalR.setForeground(Color.BLACK);
		lblSubTotalR.setFont(new Font("Calibri", Font.BOLD, 15));
		lblSubTotalR.setBackground(Color.WHITE);
		lblSubTotalR.setBounds(113, 379, 83, 20);
		base.add(lblSubTotalR);
		
		JLabel lblIVAR = new JLabel("1254.0");
		lblIVAR.setHorizontalAlignment(SwingConstants.LEFT);
		lblIVAR.setForeground(Color.BLACK);
		lblIVAR.setFont(new Font("Calibri", Font.BOLD, 15));
		lblIVAR.setBackground(Color.WHITE);
		lblIVAR.setBounds(113, 441, 83, 20);
		base.add(lblIVAR);
		
		JLabel lblTotalFacturaR = new JLabel("7524.0");
		lblTotalFacturaR.setHorizontalAlignment(SwingConstants.LEFT);
		lblTotalFacturaR.setForeground(Color.BLACK);
		lblTotalFacturaR.setFont(new Font("Calibri", Font.BOLD, 15));
		lblTotalFacturaR.setBackground(Color.WHITE);
		lblTotalFacturaR.setBounds(113, 473, 83, 20);
		base.add(lblTotalFacturaR);
		
		JCheckBox chckbxDescuento = new JCheckBox("");
		chckbxDescuento.setBackground(new Color(255, 255, 255));
		chckbxDescuento.setBounds(160, 407, 21, 23);
		base.add(chckbxDescuento);
		
		textFieldDescuento = new JTextField();
		textFieldDescuento.setText("5");
		textFieldDescuento.setBounds(110, 408, 44, 20);
		base.add(textFieldDescuento);
		textFieldDescuento.setColumns(10);
		
		JLabel lblValorDescontado = new JLabel("Valor descontado:");
		lblValorDescontado.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDescontado.setForeground(Color.BLACK);
		lblValorDescontado.setFont(new Font("Calibri", Font.PLAIN, 15));
		lblValorDescontado.setBackground(Color.WHITE);
		lblValorDescontado.setBounds(203, 411, 125, 20);
		base.add(lblValorDescontado);
		
		JLabel lblValorDescontadoR = new JLabel("330.0");
		lblValorDescontadoR.setHorizontalAlignment(SwingConstants.LEFT);
		lblValorDescontadoR.setForeground(Color.BLACK);
		lblValorDescontadoR.setFont(new Font("Calibri", Font.BOLD, 15));
		lblValorDescontadoR.setBackground(Color.WHITE);
		lblValorDescontadoR.setBounds(326, 410, 83, 20);
		base.add(lblValorDescontadoR);
	}
}
