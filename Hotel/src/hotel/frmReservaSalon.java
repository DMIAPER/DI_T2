/********************************************************************************
 ** Form generated from reading ui file 'reservasSH.jui'
 **
 ** Created by: Qt User Interface Compiler version 4.8.6
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package hotel;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class frmReservaSalon implements com.trolltech.qt.QUiForm<QDialog>
{
    public QWidget gridLayoutWidget_2;
    public QGridLayout laFormulario;
    public QPushButton bReservar;
    public QSpacerItem verticalSpacer_4;
    public QSpacerItem horizontalSpacer_4;
    public QGridLayout laHabita;
    public QWidget widgetNumHabitas;
    public QGroupBox selHabitas;
    public QSpinBox spNumHabitas;
    public QLabel lHabitas;
    public QSpacerItem horizontalSpacer_2;
    public QRadioButton rBNoHabita;
    public QSpacerItem horizontalSpacer_5;
    public QRadioButton rBSiHabita;
    public QSpacerItem horizontalSpacer_6;
    public QLabel label_3;
    public QSpacerItem verticalSpacer_5;
    public QSpacerItem verticalSpacer_7;
    public QSpacerItem horizontalSpacer_7;
    public QSpacerItem verticalSpacer_3;
    public QSpacerItem horizontalSpacer;
    public QSpacerItem verticalSpacer_18;
    public QSpacerItem verticalSpacer_19;
    public QGridLayout laCocina;
    public QRadioButton rbNoprecisa;
    public QRadioButton rBbufet;
    public QRadioButton Carta;
    public QRadioButton rbCita;
    public QLabel label_2;
    public QHBoxLayout laDescripcion;
    public QTextBrowser texDes;
    public QPushButton bCancelar;
    public QSpacerItem verticalSpacer_14;
    public QSpacerItem verticalSpacer_15;
    public QSpacerItem verticalSpacer_17;
    public QSpacerItem verticalSpacer_13;
    public QGridLayout laTipoEvento;
    public QRadioButton rBBanquete;
    public QRadioButton rBJornada;
    public QRadioButton rBCongreso;
    public QSpacerItem verticalSpacer_9;
    public QLabel iTipoEvento;
    public QSpacerItem horizontalSpacer_10;
    public QSpacerItem verticalSpacer_6;
    public QLabel lNumDias;
    public QGroupBox selPersonas;
    public QLabel lPersonas;
    public QSpinBox spNumPer;
    public QSpinBox spNumDias;
    public QLabel lDias;
    public QGridLayout laDatosCliente;
    public QSpacerItem verticalSpacer_2;
    public QLineEdit tFApellidos;
    public QSpacerItem horizontalSpacer_3;
    public QSpacerItem horizontalSpacer_8;
    public QSpacerItem horizontalSpacer_9;
    public QSpacerItem verticalSpacer;
    public QLabel lTelefono;
    public QLineEdit tFNombre;
    public QLabel lApellidos;
    public QLineEdit tFTelefono;
    public QLabel iSelFecha;
    public QLabel lNombre;
    public QLabel iDatosCliente;
    public QSpacerItem verticalSpacer_8;
    public QSpacerItem verticalSpacer_11;
    public QSpacerItem verticalSpacer_10;
    public QSpacerItem verticalSpacer_12;
    public QCalendarWidget widgetCalendario;

    public frmReservaSalon() { super(); }

    void oculNumDias(){
       spNumDias.setVisible(false);
       lNumDias.setVisible(false);
       lDias.setVisible(false);
       spNumDias.setDisabled(true);
    }
    
    void mostNumDias(){
       spNumDias.setVisible(true);
       lNumDias.setVisible(true);
       lDias.setVisible(true); 
       spNumDias.setEnabled(true);
    }
    
    void desNumHabita(){
        spNumHabitas.setEnabled(false);
    }
    
    void habNumHabita(){
        spNumHabitas.setEnabled(true);
    }

    
    public void setupUi(QDialog DialogReservaSalon)
    {
        DialogReservaSalon.setObjectName("DialogReservaSalon");
        DialogReservaSalon.resize(new QSize(741, 803).expandedTo(DialogReservaSalon.minimumSizeHint()));
        gridLayoutWidget_2 = new QWidget(DialogReservaSalon);
        gridLayoutWidget_2.setObjectName("gridLayoutWidget_2");
        gridLayoutWidget_2.setGeometry(new QRect(10, 10, 721, 781));
        laFormulario = new QGridLayout(gridLayoutWidget_2);
        laFormulario.setObjectName("laFormulario");
        bReservar = new QPushButton(gridLayoutWidget_2);
        bReservar.setObjectName("bReservar");
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(bReservar.sizePolicy().hasHeightForWidth());
        bReservar.setSizePolicy(sizePolicy);
        bReservar.setIcon(new QIcon(new QPixmap("classpath:recursos/pluma.png")));

        laFormulario.addWidget(bReservar, 9, 1, 1, 1);

        verticalSpacer_4 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        laFormulario.addItem(verticalSpacer_4, 8, 1, 1, 1);

        horizontalSpacer_4 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laFormulario.addItem(horizontalSpacer_4, 7, 1, 1, 1);

        laHabita = new QGridLayout();
        laHabita.setObjectName("laHabita");
        widgetNumHabitas = new QWidget(gridLayoutWidget_2);
        widgetNumHabitas.setObjectName("widgetNumHabitas");
        selHabitas = new QGroupBox(widgetNumHabitas);
        selHabitas.setObjectName("selHabitas");
        selHabitas.setGeometry(new QRect(10, 0, 251, 51));
        QFont font = new QFont();
        font.setFamily("Cooper Black");
        selHabitas.setFont(font);
        spNumHabitas = new QSpinBox(selHabitas);
        spNumHabitas.setObjectName("spNumHabitas");
        spNumHabitas.setEnabled(false);
        spNumHabitas.setGeometry(new QRect(40, 20, 42, 22));
        spNumHabitas.setMaximum(250);
        lHabitas = new QLabel(selHabitas);
        lHabitas.setObjectName("lHabitas");
        lHabitas.setGeometry(new QRect(90, 20, 141, 21));
        QFont font1 = new QFont();
        font1.setFamily("Cooper Black");
        lHabitas.setFont(font1);

        laHabita.addWidget(widgetNumHabitas, 3, 0, 2, 5);

        horizontalSpacer_2 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laHabita.addItem(horizontalSpacer_2, 2, 2, 1, 1);

        rBNoHabita = new QRadioButton(gridLayoutWidget_2);
        QButtonGroup buttonGroup_3 = new QButtonGroup(DialogReservaSalon);
        buttonGroup_3.addButton(rBNoHabita);
        rBNoHabita.setObjectName("rBNoHabita");
        rBNoHabita.setChecked(true);

        laHabita.addWidget(rBNoHabita, 2, 1, 1, 1);

        horizontalSpacer_5 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laHabita.addItem(horizontalSpacer_5, 2, 3, 1, 1);

        rBSiHabita = new QRadioButton(gridLayoutWidget_2);
        buttonGroup_3.addButton(rBSiHabita);
        rBSiHabita.setObjectName("rBSiHabita");
        rBSiHabita.setChecked(false);

        laHabita.addWidget(rBSiHabita, 2, 0, 1, 1);

        horizontalSpacer_6 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laHabita.addItem(horizontalSpacer_6, 2, 4, 1, 1);

        label_3 = new QLabel(gridLayoutWidget_2);
        label_3.setObjectName("label_3");
        QFont font2 = new QFont();
        font2.setFamily("Monotype Corsiva");
        font2.setPointSize(14);
        font2.setBold(true);
        font2.setItalic(true);
        font2.setWeight(75);
        label_3.setFont(font2);

        laHabita.addWidget(label_3, 1, 0, 1, 5);


        laFormulario.addLayout(laHabita, 8, 0, 2, 1);

        verticalSpacer_5 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_5, 2, 0, 1, 1);

        verticalSpacer_7 = new QSpacerItem(10, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_7, 6, 0, 1, 1);

        horizontalSpacer_7 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laFormulario.addItem(horizontalSpacer_7, 7, 2, 1, 1);

        verticalSpacer_3 = new QSpacerItem(20, 210, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_3, 3, 1, 3, 1);

        horizontalSpacer = new QSpacerItem(200, 5, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laFormulario.addItem(horizontalSpacer, 2, 1, 1, 2);

        verticalSpacer_18 = new QSpacerItem(20, 38, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_18, 8, 2, 1, 1);

        verticalSpacer_19 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_19, 6, 2, 1, 1);

        laCocina = new QGridLayout();
        laCocina.setObjectName("laCocina");
        rbNoprecisa = new QRadioButton(gridLayoutWidget_2);
        QButtonGroup buttonGroup_2 = new QButtonGroup(DialogReservaSalon);
        buttonGroup_2.addButton(rbNoprecisa);
        rbNoprecisa.setObjectName("rbNoprecisa");

        laCocina.addWidget(rbNoprecisa, 1, 3, 1, 1);

        rBbufet = new QRadioButton(gridLayoutWidget_2);
        buttonGroup_2.addButton(rBbufet);
        rBbufet.setObjectName("rBbufet");
        rBbufet.setChecked(true);

        laCocina.addWidget(rBbufet, 1, 0, 1, 1);

        Carta = new QRadioButton(gridLayoutWidget_2);
        buttonGroup_2.addButton(Carta);
        Carta.setObjectName("Carta");

        laCocina.addWidget(Carta, 1, 1, 1, 1);

        rbCita = new QRadioButton(gridLayoutWidget_2);
        buttonGroup_2.addButton(rbCita);
        rbCita.setObjectName("rbCita");

        laCocina.addWidget(rbCita, 1, 2, 1, 1);

        label_2 = new QLabel(gridLayoutWidget_2);
        label_2.setObjectName("label_2");
        QFont font3 = new QFont();
        font3.setFamily("Monotype Corsiva");
        font3.setPointSize(14);
        font3.setBold(true);
        font3.setItalic(true);
        font3.setWeight(75);
        label_2.setFont(font3);

        laCocina.addWidget(label_2, 0, 0, 1, 4);


        laFormulario.addLayout(laCocina, 7, 0, 1, 1);

        laDescripcion = new QHBoxLayout();
        laDescripcion.setObjectName("laDescripcion");
        texDes = new QTextBrowser(gridLayoutWidget_2);
        texDes.setObjectName("texDes");
        texDes.setEnabled(false);
        QFont font4 = new QFont();
        font4.setFamily("Cooper Std Black");
        font4.setPointSize(11);
        font4.setBold(true);
        font4.setWeight(75);
        texDes.setFont(font4);
        texDes.setProperty("cursor", new QCursor(Qt.CursorShape.PointingHandCursor));

        laDescripcion.addWidget(texDes);


        laFormulario.addLayout(laDescripcion, 1, 1, 1, 2);

        bCancelar = new QPushButton(gridLayoutWidget_2);
        bCancelar.setObjectName("bCancelar");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(bCancelar.sizePolicy().hasHeightForWidth());
        bCancelar.setSizePolicy(sizePolicy1);
        bCancelar.setIcon(new QIcon(new QPixmap("classpath:recursos/application-exit.png")));

        laFormulario.addWidget(bCancelar, 9, 2, 1, 1);

        verticalSpacer_14 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_14, 4, 2, 1, 1);

        verticalSpacer_15 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_15, 5, 2, 1, 1);

        verticalSpacer_17 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_17, 6, 1, 1, 1);

        verticalSpacer_13 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laFormulario.addItem(verticalSpacer_13, 3, 2, 1, 1);

        laTipoEvento = new QGridLayout();
        laTipoEvento.setObjectName("laTipoEvento");
        rBBanquete = new QRadioButton(gridLayoutWidget_2);
        QButtonGroup buttonGroup = new QButtonGroup(DialogReservaSalon);
        buttonGroup.addButton(rBBanquete);
        rBBanquete.setObjectName("rBBanquete");
        rBBanquete.setEnabled(true);
        QFont font5 = new QFont();
        font5.setFamily("Cooper Black");
        rBBanquete.setFont(font5);
        rBBanquete.setChecked(true);

        laTipoEvento.addWidget(rBBanquete, 1, 0, 1, 1);

        rBJornada = new QRadioButton(gridLayoutWidget_2);
        buttonGroup.addButton(rBJornada);
        rBJornada.setObjectName("rBJornada");
        QFont font6 = new QFont();
        font6.setFamily("Cooper Black");
        rBJornada.setFont(font6);

        laTipoEvento.addWidget(rBJornada, 2, 0, 1, 1);

        rBCongreso = new QRadioButton(gridLayoutWidget_2);
        buttonGroup.addButton(rBCongreso);
        rBCongreso.setObjectName("rBCongreso");
        QFont font7 = new QFont();
        font7.setFamily("Cooper Black");
        rBCongreso.setFont(font7);

        laTipoEvento.addWidget(rBCongreso, 3, 0, 1, 1);

        verticalSpacer_9 = new QSpacerItem(20, 75, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laTipoEvento.addItem(verticalSpacer_9, 1, 1, 3, 1);

        iTipoEvento = new QLabel(gridLayoutWidget_2);
        iTipoEvento.setObjectName("iTipoEvento");
        QFont font8 = new QFont();
        font8.setFamily("Monotype Corsiva");
        font8.setPointSize(14);
        font8.setBold(true);
        font8.setItalic(true);
        font8.setWeight(75);
        iTipoEvento.setFont(font8);

        laTipoEvento.addWidget(iTipoEvento, 0, 0, 1, 2);

        horizontalSpacer_10 = new QSpacerItem(210, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laTipoEvento.addItem(horizontalSpacer_10, 1, 2, 1, 2);

        verticalSpacer_6 = new QSpacerItem(5, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laTipoEvento.addItem(verticalSpacer_6, 0, 2, 1, 2);

        lNumDias = new QLabel(gridLayoutWidget_2);
        lNumDias.setObjectName("lNumDias");
        QFont font9 = new QFont();
        font9.setFamily("Cooper Black");
        lNumDias.setFont(font9);

        laTipoEvento.addWidget(lNumDias, 2, 2, 1, 2);

        selPersonas = new QGroupBox(gridLayoutWidget_2);
        selPersonas.setObjectName("selPersonas");
        QFont font10 = new QFont();
        font10.setFamily("Cooper Black");
        selPersonas.setFont(font10);
        lPersonas = new QLabel(selPersonas);
        lPersonas.setObjectName("lPersonas");
        lPersonas.setGeometry(new QRect(70, 30, 71, 21));
        spNumPer = new QSpinBox(selPersonas);
        spNumPer.setObjectName("spNumPer");
        spNumPer.setEnabled(true);
        spNumPer.setGeometry(new QRect(10, 30, 51, 22));
        spNumPer.setMaximum(250);

        laTipoEvento.addWidget(selPersonas, 4, 0, 1, 4);

        spNumDias = new QSpinBox(gridLayoutWidget_2);
        spNumDias.setObjectName("spNumDias");
        spNumDias.setEnabled(false);

        laTipoEvento.addWidget(spNumDias, 3, 2, 1, 1);

        lDias = new QLabel(gridLayoutWidget_2);
        lDias.setObjectName("lDias");
        QFont font11 = new QFont();
        font11.setFamily("Cooper Black");
        lDias.setFont(font11);

        laTipoEvento.addWidget(lDias, 3, 3, 1, 1);


        laFormulario.addLayout(laTipoEvento, 3, 0, 3, 1);

        laDatosCliente = new QGridLayout();
        laDatosCliente.setObjectName("laDatosCliente");
        verticalSpacer_2 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laDatosCliente.addItem(verticalSpacer_2, 4, 1, 1, 1);

        tFApellidos = new QLineEdit(gridLayoutWidget_2);
        tFApellidos.setObjectName("tFApellidos");
        QFont font12 = new QFont();
        font12.setFamily("Cooper Black");
        tFApellidos.setFont(font12);

        laDatosCliente.addWidget(tFApellidos, 2, 1, 1, 4);

        horizontalSpacer_3 = new QSpacerItem(20, 40, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding);

        laDatosCliente.addItem(horizontalSpacer_3, 1, 4, 1, 1);

        horizontalSpacer_8 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laDatosCliente.addItem(horizontalSpacer_8, 3, 3, 1, 1);

        horizontalSpacer_9 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        laDatosCliente.addItem(horizontalSpacer_9, 3, 4, 1, 1);

        verticalSpacer = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laDatosCliente.addItem(verticalSpacer, 4, 0, 1, 1);

        lTelefono = new QLabel(gridLayoutWidget_2);
        lTelefono.setObjectName("lTelefono");
        QFont font13 = new QFont();
        font13.setFamily("Cooper Black");
        lTelefono.setFont(font13);

        laDatosCliente.addWidget(lTelefono, 3, 0, 1, 1);

        tFNombre = new QLineEdit(gridLayoutWidget_2);
        tFNombre.setObjectName("tFNombre");
        QFont font14 = new QFont();
        font14.setFamily("Cooper Black");
        tFNombre.setFont(font14);

        laDatosCliente.addWidget(tFNombre, 1, 1, 1, 3);

        lApellidos = new QLabel(gridLayoutWidget_2);
        lApellidos.setObjectName("lApellidos");
        QFont font15 = new QFont();
        font15.setFamily("Cooper Black");
        font15.setPointSize(8);
        lApellidos.setFont(font15);

        laDatosCliente.addWidget(lApellidos, 2, 0, 1, 1);

        tFTelefono = new QLineEdit(gridLayoutWidget_2);
        tFTelefono.setObjectName("tFTelefono");
        QFont font16 = new QFont();
        font16.setFamily("Cooper Black");
        tFTelefono.setFont(font16);

        laDatosCliente.addWidget(tFTelefono, 3, 1, 1, 2);

        iSelFecha = new QLabel(gridLayoutWidget_2);
        iSelFecha.setObjectName("iSelFecha");
        QFont font17 = new QFont();
        font17.setFamily("Monotype Corsiva");
        font17.setPointSize(14);
        font17.setBold(true);
        font17.setItalic(true);
        font17.setWeight(75);
        iSelFecha.setFont(font17);

        laDatosCliente.addWidget(iSelFecha, 5, 0, 1, 6);

        lNombre = new QLabel(gridLayoutWidget_2);
        lNombre.setObjectName("lNombre");
        QFont font18 = new QFont();
        font18.setFamily("Cooper Black");
        font18.setPointSize(8);
        lNombre.setFont(font18);

        laDatosCliente.addWidget(lNombre, 1, 0, 1, 1);

        iDatosCliente = new QLabel(gridLayoutWidget_2);
        iDatosCliente.setObjectName("iDatosCliente");
        QFont font19 = new QFont();
        font19.setFamily("Monotype Corsiva");
        font19.setPointSize(14);
        font19.setBold(true);
        font19.setItalic(true);
        font19.setWeight(75);
        iDatosCliente.setFont(font19);

        laDatosCliente.addWidget(iDatosCliente, 0, 0, 1, 4);

        verticalSpacer_8 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laDatosCliente.addItem(verticalSpacer_8, 4, 2, 1, 1);

        verticalSpacer_11 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laDatosCliente.addItem(verticalSpacer_11, 0, 4, 1, 1);

        verticalSpacer_10 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laDatosCliente.addItem(verticalSpacer_10, 4, 3, 1, 1);

        verticalSpacer_12 = new QSpacerItem(20, 10, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);

        laDatosCliente.addItem(verticalSpacer_12, 4, 4, 1, 1);

        widgetCalendario = new QCalendarWidget(gridLayoutWidget_2);
        widgetCalendario.setObjectName("widgetCalendario");

        laDatosCliente.addWidget(widgetCalendario, 6, 0, 1, 6);


        laFormulario.addLayout(laDatosCliente, 1, 0, 1, 1);

        lTelefono.setBuddy(tFTelefono);
        lApellidos.setBuddy(tFApellidos);
        lNombre.setBuddy(tFNombre);
        QWidget.setTabOrder(tFNombre, tFApellidos);
        QWidget.setTabOrder(tFApellidos, tFTelefono);
        QWidget.setTabOrder(tFTelefono, widgetCalendario);
        QWidget.setTabOrder(widgetCalendario, rBBanquete);
        QWidget.setTabOrder(rBBanquete, rBJornada);
        QWidget.setTabOrder(rBJornada, rBCongreso);
        QWidget.setTabOrder(rBCongreso, spNumPer);
        QWidget.setTabOrder(spNumPer, rBbufet);
        QWidget.setTabOrder(rBbufet, Carta);
        QWidget.setTabOrder(Carta, rbCita);
        QWidget.setTabOrder(rbCita, rbNoprecisa);
        QWidget.setTabOrder(rbNoprecisa, rBSiHabita);
        QWidget.setTabOrder(rBSiHabita, rBNoHabita);
        QWidget.setTabOrder(rBNoHabita, spNumHabitas);
        QWidget.setTabOrder(spNumHabitas, bReservar);
        QWidget.setTabOrder(bReservar, bCancelar);
        QWidget.setTabOrder(bCancelar, texDes);
        retranslateUi(DialogReservaSalon);
        bReservar.clicked.connect(DialogReservaSalon, "accept()");
        bCancelar.clicked.connect(DialogReservaSalon, "close()");
        
        //modificaciones sobre el codigo para realizar las funcionalidades debido a que el copilador, no lo copila correctamente
        rBSiHabita.clicked.connect(this, "habNumHabita()");
        rBNoHabita.clicked.connect(this, "desNumHabita()");
        rBJornada.clicked.connect(this, "oculNumDias()");
        rBBanquete.clicked.connect(this, "oculNumDias()");
        rBCongreso.clicked.connect(this, "mostNumDias()");

        DialogReservaSalon.connectSlotsByName();
        oculNumDias();
    } // setupUi

    void retranslateUi(QDialog DialogReservaSalon)
    {
        DialogReservaSalon.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Dialog", null));
        bReservar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Se realizara la reserva", null));
        bReservar.setWhatsThis(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "<html><head/><body><p><br/></p></body></html>", null));
        bReservar.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Reserva", null));
        selHabitas.setTitle(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "N\u00famero de habitaciones para el evento", null));
        spNumHabitas.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Seleccione un n\u00famero de habitaciones para reservar", null));
        spNumHabitas.setStatusTip("");
        lHabitas.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Habitaciones necesarias", null));
        rBNoHabita.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "No se reservaran habitaciones para este evento", null));
        rBNoHabita.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "No", null));
        rBSiHabita.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Nos indicara que necesita habitaciones para este evento", null));
        rBSiHabita.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Si", null));
        label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "\u00bfNecesita habitaciones para su evento?", null));
        rbNoprecisa.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "No preciso", null));
        rBbufet.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Bufet", null));
        Carta.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Carta", null));
        rbCita.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Cita con el Chef", null));
        label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "\u00bfQue tipo de cocina necesita para su evento?", null));
        texDes.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Peque\u00f1a descripci\u00f3n del salon habana", null));
        texDes.setHtml(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0//EN\" \"http://www.w3.org/TR/REC-html40/strict.dtd\">\n"+
"<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
"p, li { white-space: pre-wrap; }\n"+
"</style></head><body style=\" font-family:'Cooper Std Black'; font-size:11pt; font-weight:600; font-style:normal;\">\n"+
"<p align=\"center\" style=\" margin-top:12px; margin-bottom:12px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-size:9pt; text-decoration: underline;\">Descripci\u00f3n de nuestro sal\u00f3n Habana</span></p>\n"+
"<p align=\"justify\" style=\" margin-top:12px; margin-bottom:12px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><span style=\" font-family:'MS Shell Dlg 2'; font-size:8pt; font-weight:400;\">Nuestro sal\u00f3n Habana, es uno de los m\u00e1s modernos del mundo, con un aforo de 250 pax. Cuenta con un sistema multimedia similar al de los cines. En \u00e9l se han celebrado variedad de eventos, as\u00ed como bodas, o el segundo campeonato de EA Sports. </span></p>\n"+
"<p align=\"center\" style=\" margin-top:12px; margin-bottom:12px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><img src=\"classpath:recursos/salon2.png\" /></p>\n"+
"<p align=\"center\" style=\" margin-top:12px; margin-bottom:12px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px;\"><img src=\"classpath:recursos/salon1.png\" /></p></body></html>", null));
        bCancelar.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Se cancelara la reserva", null));
        bCancelar.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Cancelar", null));
        rBBanquete.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "<html><head/><body><p>Seleccionara que realicemos un banquete</p></body></html>", null));
        rBBanquete.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Banquete", null));
        rBJornada.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "<html><head/><body><p>Seleccionara que realicemos un jornada</p></body></html>", null));
        rBJornada.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Jornada", null));
        rBCongreso.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "<html><head/><body><p>Seleccionara que realicemos un congreso</p></body></html>", null));
        rBCongreso.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Congreso", null));
        iTipoEvento.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Seleccione el tipo de evento", null));
        lNumDias.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "N\u00famero de d\u00edas que dura el congreso", null));
        selPersonas.setTitle(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "N\u00famero de personas que van a asistir:", null));
        lPersonas.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Personas", null));
        lDias.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "D\u00edas de duraci\u00f3n", null));
        tFApellidos.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Introduzca sus apellidos", null));
        lTelefono.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Tel\u00e9fono:", null));
        tFNombre.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Introduzca su nombre y apellidos", null));
        lApellidos.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Apellidos:", null));
        tFTelefono.setToolTip(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Introduzca un tel\u00e9fono de contacto", null));
        tFTelefono.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "+34", null));
        iSelFecha.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Seleccione un fecha para su evento", null));
        lNombre.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Nombre:", null));
        iDatosCliente.setText(com.trolltech.qt.core.QCoreApplication.translate("DialogReservaSalon", "Datos del cliente", null));
    } // retranslateUi

}

