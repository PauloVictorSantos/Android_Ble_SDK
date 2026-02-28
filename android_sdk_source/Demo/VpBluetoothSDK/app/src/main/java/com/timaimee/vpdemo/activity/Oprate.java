package com.timaimee.vpdemo.activity;

/**
 * Criado por Administrator em 25/11/2017.
 */public interface Oprate {
    String PWD_COMFIRM = "1. Senha do Dispositivo - Verificar";
    String PWD_COMFIRM_2_DISCONNECT = "Conectar BT e Desconectar Imediatamente";
    String PWD_COMFIRM_2_DISCONNECT_ = "Desconectar BLE Diretamente";
    String PERSONINFO_SYNC = "2. Informações Pessoais - Definir";
    String SETTING_FIRST = "<-- Opere 1 e 2 Primeiro";
    String PWD_MODIFY = "Senha do Dispositivo - Modificar";
    String TEMPTURE_DETECT_START = "Medir Temperatura - Iniciar";
    String TEMPTURE_DETECT_STOP = "Medir Temperatura - Parar";
    String HEART_DETECT_START = "Medir Frequência Cardíaca - Iniciar";
    String HEART_DETECT_STOP = "Medir Frequência Cardíaca - Parar";
    String BP_DETECT_START = "Medir Pressão Arterial - Iniciar";
    String BP_DETECT_STOP = "Medir Pressão Arterial - Parar";
    String BP_DETECTMODEL_SETTING = "Modo de Pressão Arterial - Definir";
    String BP_DETECTMODEL_SETTING_ADJUSTE = "Modo de PA [Ajuste Dinâmico] - Definir";
    String BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL = "Modo de PA [Ajuste Dinâmico] - Cancelar";
    String BP_DETECTMODEL_READ = "Modo de Pressão Arterial - Ler";
    String SPORT_CURRENT_READ = "Passos Atuais - Ler";
    String CAMERA_START = "Modo Câmera - Iniciar";
    String CAMERA_STOP = "Modo Câmera - Parar";
    String ALARM_SETTING = "Alarme - Definir";
    String ALARM_READ = "Alarme - Ler";
    String ALARM_NEW_READ = "Novo Alarme - Ler";
    String ALARM_NEW_ADD = "Novo Alarme - Adicionar";
    String ALARM_NEW_MODIFY = "Novo Alarme - Modificar";
    String ALARM_NEW_DELETE = "Novo Alarme - Excluir";
    String ALARM_NEW_LISTENER = "Novo Alarme - Ouvir Mudança de Estado";
    String ALARM_NEW_ = "Novo Alarme";
    String LONGSEAT_SETTING_OPEN = "Lembrete de Sedentarismo - Ligar";
    String LONGSEAT_SETTING_CLOSE = "Lembrete de Sedentarismo - Desligar";
    String LONGSEAT_READ = "Lembrete de Sedentarismo - Ler";
    String LANGUAGE_CHINESE = "Definir Idioma - Chinês";
    String LANGUAGE_ENGLISH = "Definir Idioma - Inglês";
    String BATTERY = "Estado da Bateria - Ler";
    String NIGHT_TURN_WRIST_OPEN = "Girar Pulso à Noite - Ligar";
    String NIGHT_TURN_WRIST_CLOSE = "Girar Pulso à Noite - Desligar";
    String NIGHT_TURN_WRIST_READ = "Girar Pulso à Noite - Ler";
    String NIGHT_TURN_WRIST_CUSTOM_TIME = "Girar Pulso à Noite - Tempo Personalizado";
    String NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL = "Girar Pulso à Noite - Tempo e Nível Personalizados";
    String FINDPHONE = "Encontrar Telefone";
    String CHECK_WEAR_SETING_OPEN = "Detecção de Uso - Ligar";
    String CHECK_WEAR_SETING_CLOSE = "Detecção de Uso - Desligar";
    String FINDDEVICE_SETTING_OPEN = "Anti-perda de Dispositivo - Ligar";
    String FINDDEVICE_SETTING_CLOSE = "Anti-perda de Dispositivo - Desligar";
    String FINDDEVICE_READ = "Anti-perda de Dispositivo - Ler";
    String DEVICE_COUSTOM_READ = "Personalização - Ler";
    String DEVICE_COUSTOM_SETTING = "Personalização - Definir";
    String DEVICE_ECG_ALWAYS_OPEN = "ECG Contínuo - Ligar";
    String DEVICE_ECG_ALWAYS_CLOSE = "ECG Contínuo - Desligar";
    String SOCIAL_MSG_SETTING = "Lembrete de Mensagem Social 1 - Definir";
    String SOCIAL_MSG_SETTING2 = "Lembrete de Mensagem Social 2 - Definir";
    String SOCIAL_MSG_READ = "Lembrete de Mensagem Social - Ler Configurações";
    String SOCIAL_MSG_SEND = "Lembrete de Mensagem Social - Enviar Conteúdo";
    String SOCIAL_PHONE_IDLE_OR_OFFHOOK = "Lembrete de Mensagem Social - Atender Chamada";
    String DEVICE_CONTROL_PHONE = "Ouvir do Dispositivo - Desligar, Silenciar";
    String HEARTWRING_READ = "Alerta de Frequência Cardíaca - Ler";
    String HEARTWRING_OPEN = "Alerta de Frequência Cardíaca - Ligar";
    String HEARTWRING_CLOSE = "Alerta de Frequência Cardíaca - Desligar";
    String SPO2H_OPEN = "Oxigênio no Sangue - Ler";
    String SPO2H_CLOSE = "Oxigênio no Sangue - Parar";
    String SPO2H_AUTO_DETECT_READ = "Detecção Automática de SpO2 - Ler";
    String SPO2H_AUTO_DETECT_OPEN = "Detecção Automática de SpO2 - Ligar";
    String SPO2H_AUTO_DETECT_CLOSE = "Detecção Automática de SpO2 - Desligar";
    String FATIGUE_OPEN = "Fadiga - Ler";
    String FATIGUE_CLOSE = "Fadiga - Parar";
    String WOMEN_SETTING = "Saúde Feminina - Definir";
    String WOMEN_READ = "Saúde Feminina - Ler";
    String COUNT_DOWN_WATCH_CLOSE_UI = "Contagem Regressiva - Uso no Relógio (UI Fechada)";
    String COUNT_DOWN_WATCH_OPEN_UI = "Contagem Regressiva - Uso no Relógio (UI Aberta)";
    String COUNT_DOWN_APP = "Contagem Regressiva - Uso no App";
    String COUNT_DOWN_APP_READ = "Contagem Regressiva - Ler";
    String GPS_KAABA = "Fuso Horário GPS e Caaba";
    String GPS_REPORT_START = "Relatório GPS";
    String READ_CHANTING = "Ler Cânticos";
    String SCREEN_LIGHT_SETTING = "Ajuste de Tela - Definir";
    String SCREEN_LIGHT_READ = "Ajuste de Tela - Ler";
    String SCREEN_STYLE_READ = "Estilo de Tela - Ler";
    String SCREEN_STYLE_SETTING = "Estilo de Tela - Definir";
    String AIM_SPROT_CALC = "Meta de Passos - Calcular";
    String INSTITUTION_TRANSLATION = "Conversão Métrico/Imperial";
    String READ_TEMPTURE_DATA = "Ler Dados de Temperatura";
    String READ_HEALTH_DRINK = "Ler Dados de Saúde - Consumo de Álcool";
    String READ_HEALTH_SLEEP = "Ler Dados de Saúde - Sono";
    String READ_HEALTH_SLEEP_FROM = "Ler Dados de Saúde - Sono - A partir de";
    String READ_HEALTH_SLEEP_SINGLEDAY = "Ler Dados de Saúde - Sono - Ler este dia";
    String READ_HEALTH_ORIGINAL = "Ler Dados de Saúde - 5 minutos";
    String READ_HEALTH_ORIGINAL_FROM = "Ler Dados de Saúde - A partir de";
    String READ_HEALTH_ORIGINAL_SINGLEDAY = "Ler Dados de Saúde - Ler este dia";
    String READ_HEALTH = "Ler Dados de Saúde - Todos";
    String OAD = "Atualização de Firmware";
    String SHOW_SP = "Mostrar SharedPreferences";
    String SPORT_MODE_ORIGIN_READ = "Ler Dados - Modo Esporte";
    String SPORT_MODE_ORIGIN_READSTAUTS = "Ler Estado - Modo Esporte";
    String SPORT_MODE_ORIGIN_START = "Iniciar - Modo Esporte";
    String SPORT_MODE_START_INDOOR = "Iniciar - Caminhada Indoor";
    String SPORT_MODE_ORIGIN_END = "Parar - Modo Esporte";
    String SPO2H_ORIGIN_READ = "Ler Dados - Dados de Oxigênio no Sangue";
    String HRV_ORIGIN_READ = "Ler Dados - Dados de HRV";
    String CLEAR_DEVICE_DATA = "Limpar Dados";
    String DISCONNECT = "Conexão Bluetooth - Desconectar";
    String DETECT_PTT = "PTT";
    String DETECT_START_ECG = "Iniciar Medição de ECG";
    String DETECT_STOP_ECG = "Parar Medição de ECG";
    String LOW_POWER_READ = "Baixo Consumo - Ler";
    String LOW_POWER_OPEN = "Baixo Consumo - Ligar";
    String LOW_POWER_CLOSE = "Baixo Consumo - Desligar";
    String S22_READ_DATA = "S22 - Leitura de Dados";
    String S22_READ_STATE = "S22 - Leitura de Estado";
    String S22_SETTING_STATE_OPEN = "S22 - Definir Estado (Ligar)";
    String S22_SETTING_STATE_CLOSE = "S22 - Definir Estado (Desligar)";
    String BP_FUNCTION_READ = "Estado da Pressão Arterial (Ler)";
    String BP_FUNCTION_SETTING = "Estado da Pressão Arterial (Definir)";
    String WEATHER_READ_STATUEINFO = "Estado do Tempo (Ler)";
    String SET_WATCH_TIME = "Definir Hora";
    String WEATHER_SETTING_STATUEINFO_ON = "Estado do Tempo (Ligar)";
    String WEATHER_SETTING_STATUEINFO_OFF = "Estado do Tempo (Desligar)";
    String WEATHER_SETTING_DATA = "Dados do Tempo (Definir)";

    String LIANSUO_SOS = "Liansuo - Ouvir SOS";
    String LIANSUO_SEND_ORDER = "Liansuo - Enviar Comando";
    String LIANSUO_SEND_CONTENT = "Liansuo - Enviar Conteúdo";
    String UI_UPDATE_AGPS = "Atualização de UI - AGPS";
    String UI_UPDATE_CUSTOM = "Atualização de UI - Mostrador Personalizado";
    String UI_UPDATE_SERVER = "Atualização de UI - Mostrador do Servidor";
    String SYNC_MUSIC_INFO_PLAY = "Música - Reproduzir";
    String SYNC_MUSIC_INFO_PAUSE = "Música - Pausar";
    String VOLUME = "Volume";
    String UI_UPDATE_G15IMG = "Atualização de UI - Transferência de Imagem G15";
    String TEXT_ALARM_ADD = "Adicionar Alarme de Texto";
    String TEXT_ALARM_MODIFY = "Modificar Alarme de Texto";
    String TEXT_ALARM_READ = "Ler Alarme de Texto";
    String TEXT_ALARM_DELETE = "Excluir Alarme de Texto";
    String TEXT_ALARM = "Alarme de Texto";
    String ORIGIN_LOG = "Log de Dados Brutos";
    String RR = "Quadro a Quadro RR";
    String G15_QR_CODE = "Código QR G15";
    String ECG_AUTO_REPORT_TEXT = "Ouvir Dados de ECG Contínuo";
    String START_BLOOD_GLUCOSE = "Iniciar Monitoramento de Glicose";
    String STOP_BLOOD_GLUCOSE = "Parar Monitoramento de Glicose";
    String BLOOD_GLUCOSE_P_READ = "Leitura do Modo Privado de Glicose";
    String BLOOD_GLUCOSE_P_SETTING = "Definição do Modo Privado de Glicose";

    String BLOOD_GLUCOSE_MULTIPLE_READ = "Leitura de Calibração Múltipla de Glicose";
    String BLOOD_GLUCOSE_MULTIPLE_SETTING = "Definição de Calibração Múltipla de Glicose";
    String FIND_DEVICE = "Encontrar Telefone";
    String BLE_RENAME = "Renomear Bluetooth 4.0";
    String BT_RENAME = "Renomear Bluetooth 3.0";
    String BT_CONNECT = "Conectar BT";
    String BT_CLOSE = "Desligar BT";
    String BLE_DISCONNECT = "Desconectar BLE";
    String BT_READ = "Ler BT";
    String HEALTH_REMIND = "Lembrete de Saúde";
    String JL_NOTIFY_OPEN = "Abrir Notificação Jieli";
    String JL_AUTH = "Autenticação Jieli";
    String JL_INIT_FILE_SYS = "Sistema de Arquivos Jieli";
    String JL_SET_PHOTO_DIAL = "Definir Mostrador de Foto Jieli";

    String JL_DEVICE = "Relacionado ao Relógio Jieli";

    String JL_DEVICE_OTA = "OTA Jieli";

    String CONTACT = "Contatos";
    String GATT_CLOSE = "Gatt-Fechar";
    String FUNCTION_SWITCH = "Interruptor de Escuta Global";
    String READ_ECG_ID = "Ler ID do ECG";
    String READ_ECG_DATA = "Ler Dados do ECG";
    String SET_ECG_NEW_DATA_REPORT = "Ouvir Relatório de Novos Dados de ECG";

    String DETECT_START_BODY_COMPONENT = "Iniciar Medição de Composição Corporal";
    String DETECT_STOP_BODY_COMPONENT = "Parar Medição de Composição Corporal";
    String READ_BODY_COMPONENT_ID = "Ler ID da Composição Corporal";
    String READ_BODY_COMPONENT_DATA = "Ler Dados da Composição Corporal";

    String SET_BODY_COMPONENT_NEW_DATA_REPORT = "Ouvir Relatório de Novos Dados de Comp. Corporal";
    String SHARE_LOG = "Compartilhar Log";
    String READ_BLOOD_COMPOSITION_CALIBRATION = "Ler Valor de Calibração de Composição Sanguínea";
    String SETTING_BLOOD_COMPOSITION_CALIBRATION = "Definir Valor de Calibração de Composição Sanguínea";

    String DETECT_START_BLOOD_COMPONENT = "Iniciar Medição de Composição Sanguínea";
    String DETECT_STOP_BLOOD_COMPONENT = "Parar Medição de Composição Sanguínea";
    String DETECT_MULTI_ECG_DETECT = "ECG Multiderivações";
    String WORLD_CLOCK = "Relógio Mundial";
    String G08W_HEALTH_ALARM_INTERVAL = "G08W - Intervalo de Alarme de Saúde";
    String G08W_PPG_DATA_CALLBACK = "G08W - Callback de Dados PPG";
    String MAGNETIC_OPEN = "Terapia Magnética";
    String TEXT_IMAGE_MSG_PUSH = "Push de Texto e Imagem";
    String JH58_PPG = "Relacionado ao JH58 PPG";
    String MINI_CHECKUP = "Mini Check-up";

    String NONE = "NENHUM";
    String[] oprateStr = new String[]{
            PWD_COMFIRM, PWD_COMFIRM_2_DISCONNECT, PWD_COMFIRM_2_DISCONNECT_, PERSONINFO_SYNC, SETTING_FIRST, DISCONNECT, BT_CONNECT, BLE_DISCONNECT, PWD_MODIFY,
            SHARE_LOG, GPS_KAABA, GPS_REPORT_START, READ_CHANTING, HEART_DETECT_START, HEART_DETECT_STOP, TEMPTURE_DETECT_START, TEMPTURE_DETECT_STOP, READ_TEMPTURE_DATA, BP_DETECT_START, BP_DETECT_STOP, BP_DETECTMODEL_SETTING, BP_DETECTMODEL_READ,
            BP_DETECTMODEL_SETTING_ADJUSTE_CANCEL, BP_DETECTMODEL_SETTING_ADJUSTE,
            SPORT_CURRENT_READ, CAMERA_START, CAMERA_STOP, ALARM_SETTING, ALARM_READ, /*ALARM_NEW_READ, ALARM_NEW_ADD, ALARM_NEW_MODIFY, ALARM_NEW_DELETE,*/ ALARM_NEW_LISTENER, ALARM_NEW_,
            LONGSEAT_SETTING_OPEN, LONGSEAT_SETTING_CLOSE, LONGSEAT_READ, LANGUAGE_CHINESE, LANGUAGE_ENGLISH,
            BATTERY, NIGHT_TURN_WRIST_OPEN, NIGHT_TURN_WRIST_CLOSE, NIGHT_TURN_WRIST_READ, NIGHT_TURN_WRIST_CUSTOM_TIME, NIGHT_TURN_WRIST_CUSTOM_TIME_LEVEL,
            DEVICE_COUSTOM_READ, DEVICE_COUSTOM_SETTING, DEVICE_ECG_ALWAYS_OPEN, DEVICE_ECG_ALWAYS_CLOSE, FINDPHONE,
            CHECK_WEAR_SETING_OPEN, CHECK_WEAR_SETING_CLOSE,
            FINDDEVICE_SETTING_OPEN, FINDDEVICE_SETTING_CLOSE, FINDDEVICE_READ,
            SOCIAL_MSG_SETTING, SOCIAL_MSG_SETTING2, SOCIAL_MSG_READ, SOCIAL_MSG_SEND, DEVICE_CONTROL_PHONE, SOCIAL_PHONE_IDLE_OR_OFFHOOK, HEARTWRING_READ, HEARTWRING_OPEN, HEARTWRING_CLOSE,
            SPO2H_OPEN, SPO2H_CLOSE, SPO2H_AUTO_DETECT_READ, SPO2H_AUTO_DETECT_OPEN, SPO2H_AUTO_DETECT_CLOSE, FATIGUE_OPEN, FATIGUE_CLOSE, WOMEN_SETTING, WOMEN_READ, COUNT_DOWN_WATCH_CLOSE_UI, COUNT_DOWN_WATCH_OPEN_UI, COUNT_DOWN_APP_READ, SCREEN_LIGHT_SETTING, SCREEN_LIGHT_READ, SCREEN_STYLE_READ, SCREEN_STYLE_SETTING, AIM_SPROT_CALC, INSTITUTION_TRANSLATION,
            READ_HEALTH_SLEEP, READ_HEALTH_SLEEP_FROM, READ_HEALTH_SLEEP_SINGLEDAY, READ_HEALTH_DRINK, READ_HEALTH_ORIGINAL,
            READ_HEALTH_ORIGINAL_FROM, READ_HEALTH_ORIGINAL_SINGLEDAY, READ_HEALTH, SET_WATCH_TIME,
            OAD, SHOW_SP, SPORT_MODE_ORIGIN_READ, SPORT_MODE_ORIGIN_READSTAUTS, SPORT_MODE_START_INDOOR, SPORT_MODE_ORIGIN_START, SPORT_MODE_ORIGIN_END, SPO2H_ORIGIN_READ, HRV_ORIGIN_READ, CLEAR_DEVICE_DATA
            , DETECT_START_ECG, DETECT_STOP_ECG, NONE, LOW_POWER_READ, LOW_POWER_OPEN, LOW_POWER_CLOSE, S22_READ_DATA, S22_READ_STATE, S22_SETTING_STATE_OPEN, S22_SETTING_STATE_CLOSE, DETECT_PTT, BP_FUNCTION_READ, BP_FUNCTION_SETTING
            , WEATHER_READ_STATUEINFO, WEATHER_SETTING_STATUEINFO_ON, WEATHER_SETTING_STATUEINFO_OFF, WEATHER_SETTING_DATA, LIANSUO_SOS, LIANSUO_SEND_ORDER, LIANSUO_SEND_CONTENT, UI_UPDATE_AGPS, UI_UPDATE_CUSTOM, UI_UPDATE_SERVER
            , UI_UPDATE_G15IMG, SYNC_MUSIC_INFO_PLAY, SYNC_MUSIC_INFO_PAUSE, VOLUME,/*TEXT_ALARM_READ,TEXT_ALARM_ADD,TEXT_ALARM_MODIFY,TEXT_ALARM_DELETE,*/TEXT_ALARM, ORIGIN_LOG, RR, G15_QR_CODE, ECG_AUTO_REPORT_TEXT
            , START_BLOOD_GLUCOSE, STOP_BLOOD_GLUCOSE, BLOOD_GLUCOSE_P_READ, BLOOD_GLUCOSE_P_SETTING, BLOOD_GLUCOSE_MULTIPLE_READ, BLOOD_GLUCOSE_MULTIPLE_SETTING, FIND_DEVICE, BLE_RENAME, BT_RENAME, BT_READ, BLE_DISCONNECT, HEALTH_REMIND, FUNCTION_SWITCH,
            /*JL_NOTIFY_OPEN, JL_AUTH, JL_INIT_FILE_SYS, JL_SET_PHOTO_DIAL, JL_DEVICE_OTA, */JL_DEVICE, CONTACT, GATT_CLOSE, READ_ECG_ID, READ_ECG_DATA, SET_ECG_NEW_DATA_REPORT, DETECT_START_BODY_COMPONENT, DETECT_STOP_BODY_COMPONENT, READ_BODY_COMPONENT_ID, READ_BODY_COMPONENT_DATA, SET_BODY_COMPONENT_NEW_DATA_REPORT,
            READ_BLOOD_COMPOSITION_CALIBRATION, SETTING_BLOOD_COMPOSITION_CALIBRATION, DETECT_START_BLOOD_COMPONENT, DETECT_STOP_BLOOD_COMPONENT, DETECT_MULTI_ECG_DETECT, WORLD_CLOCK, G08W_HEALTH_ALARM_INTERVAL, G08W_PPG_DATA_CALLBACK, MAGNETIC_OPEN,
            TEXT_IMAGE_MSG_PUSH, JH58_PPG, MINI_CHECKUP
    };
}
