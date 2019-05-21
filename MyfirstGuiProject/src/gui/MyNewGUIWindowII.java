package gui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;

import data.Person;

import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.events.MouseMoveListener;
import org.eclipse.swt.events.MouseEvent;

public class MyNewGUIWindowII {

	protected Shell shlFrWindow;
	private Text vornameTF;
	private Label nachnameL;
	private Text nachnameTF;
	private Label Stra�eL;
	private Text Stra�eTF;
	private Label HausnummerL;
	private Text HausnummerTF;
	private Label PLZL;
	private Text PLZTF;
	private Label OrtL;
	private Text OrtTF;
	private Button btnAbbrechen;
	private Label vornameout;
	private Label nachnameout;
	private Label hausnummerout;
	private Label PLZout;
	private Label ortout;
	private Label stra�eout;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MyNewGUIWindowII window = new MyNewGUIWindowII();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shlFrWindow.open();
		shlFrWindow.layout();
		while (!shlFrWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shlFrWindow = new Shell();
		shlFrWindow.setBackground(SWTResourceManager.getColor(SWT.COLOR_DARK_BLUE));
		shlFrWindow.setSize(743, 522);
		shlFrWindow.setText("FR Window");
		
		Button btnNewButton = new Button(shlFrWindow, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.out.println("Knoppe gedr�ckt");
				System.out.println(vornameTF.getText());
				System.out.println(nachnameTF.getText());
				System.out.println(Stra�eTF.getText());
				System.out.println(HausnummerTF.getText());
				System.out.println(PLZTF.getText());
				System.out.println(OrtTF.getText());
				//
				getVornameout().setText(getVornameTF().getText());
				getNachnameout().setText(getNachnameTF().getText());
				getStra�eout().setText(getStra�eTF().getText());
				getHausnummerout().setText(getHausnummerTF().getText());
				getPLZout().setText(getPLZTF().getText());
				getOrtout().setText(getOrtTF().getText());
				//
				data.Person p1;
				p1 = new Person();
				p1.setVorname(getVornameTF().getText());
				p1.setNachname(getNachnameTF().getText());
				p1.setStra�e(getStra�eTF().getText());
				p1.setHausnummer(getHausnummerTF().getText());
				p1.setPLZ(getPLZTF().getText());
				p1.setOrt(getOrtTF().getText());
				//
				System.out.println(p1);
				//
				Person.getListe().add(p1);
				//
				System.out.println(Person.getListe());
				//
				getVornameTF().setText("");
				getNachnameTF().setText("");
				getStra�eTF().setText("");
				getHausnummerTF().setText("");
				getPLZTF().setText("");
				getOrtTF().setText("");
				
			
				
			}
		});
		btnNewButton.setBounds(74, 85, 75, 25);
		btnNewButton.setText("MyButton");
		
		Label vornameL = new Label(shlFrWindow, SWT.NONE);
		vornameL.setBounds(54, 143, 83, 21);
		vornameL.setText("Vorname");
		
		vornameTF = new Text(shlFrWindow, SWT.BORDER);
		vornameTF.setBounds(143, 143, 76, 21);
		
		nachnameL = new Label(shlFrWindow, SWT.NONE);
		nachnameL.setBounds(54, 168, 83, 18);
		nachnameL.setText("Nachname");
		
		nachnameTF = new Text(shlFrWindow, SWT.BORDER);
		nachnameTF.setBounds(143, 168, 76, 18);
		
		Stra�eL = new Label(shlFrWindow, SWT.NONE);
		Stra�eL.setBounds(54, 192, 83, 18);
		Stra�eL.setText("Stra\u00DFe");
		
		Stra�eTF = new Text(shlFrWindow, SWT.BORDER);
		Stra�eTF.setBounds(143, 192, 76, 18);
		
		HausnummerL = new Label(shlFrWindow, SWT.NONE);
		HausnummerL.setBounds(54, 216, 83, 18);
		HausnummerL.setText("Hausnummer");
		
		HausnummerTF = new Text(shlFrWindow, SWT.BORDER);
		HausnummerTF.setBounds(143, 216, 76, 18);
		
		PLZL = new Label(shlFrWindow, SWT.NONE);
		PLZL.setBounds(54, 240, 83, 21);
		PLZL.setText("PLZ");
		
		PLZTF = new Text(shlFrWindow, SWT.BORDER);
		PLZTF.setBounds(143, 240, 76, 21);
		
		OrtL = new Label(shlFrWindow, SWT.NONE);
		OrtL.setBounds(54, 267, 83, 21);
		OrtL.setText("Ort");
		
		OrtTF = new Text(shlFrWindow, SWT.BORDER);
		OrtTF.setBounds(143, 267, 76, 21);
		
		btnAbbrechen = new Button(shlFrWindow, SWT.NONE);
		btnAbbrechen.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				System.exit(0);
			}
		});
		btnAbbrechen.setBounds(244, 85, 75, 25);
		btnAbbrechen.setText("abbrechen");
		
		Composite composite = new Composite(shlFrWindow, SWT.NONE);
		composite.setBackground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		composite.addMouseMoveListener(new MouseMoveListener() {
			public void mouseMove(MouseEvent me) {
				System.out.println(me.x + " / " + me.y);
			}
		});
		composite.setForeground(SWTResourceManager.getColor(SWT.COLOR_GREEN));
		composite.setBounds(74, 338, 251, 99);
		
		vornameout = new Label(shlFrWindow, SWT.NONE);
		vornameout.setBounds(264, 143, 75, 21);
		
		nachnameout = new Label(shlFrWindow, SWT.NONE);
		nachnameout.setBounds(264, 168, 75, 18);
		
		hausnummerout = new Label(shlFrWindow, SWT.NONE);
		hausnummerout.setBounds(264, 216, 75, 18);
		
		PLZout = new Label(shlFrWindow, SWT.NONE);
		PLZout.setBounds(264, 240, 75, 21);
		
		ortout = new Label(shlFrWindow, SWT.NONE);
		ortout.setBounds(264, 267, 75, 21);
		
		stra�eout = new Label(shlFrWindow, SWT.NONE);
		stra�eout.setBounds(264, 192, 75, 18);
		shlFrWindow.setTabList(new Control[]{vornameTF, nachnameTF, Stra�eTF, HausnummerTF, PLZTF, OrtTF, btnNewButton});

	}
	public Text getVornameTF() {
		return vornameTF;
	}
	public Text getNachnameTF() {
		return nachnameTF;
	}
	public Label getVornameout() {
		return vornameout;
	}
	public Label getNachnameout() {
		return nachnameout;
	}
	public Label getStra�eout() {
		return stra�eout;
	}
	public Label getHausnummerout() {
		return hausnummerout;
	}
	public Label getPLZout() {
		return PLZout;
	}
	public Label getOrtout() {
		return ortout;
	}
	public Text getStra�eTF() {
		return Stra�eTF;
	}
	public Text getHausnummerTF() {
		return HausnummerTF;
	}
	public Text getPLZTF() {
		return PLZTF;
	}
	public Text getOrtTF() {
		return OrtTF;
	}
}
