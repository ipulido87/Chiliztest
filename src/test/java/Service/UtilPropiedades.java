package Service;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.logging.Logger;

public class UtilPropiedades {


    private static final Logger LOG = Logger.getLogger(UtilPropiedades.class.getName());

    private static UtilPropiedades instance = null;
    private Properties properties = new Properties();
    private String filePropertiesConfig = "datos.properties";
    private String encondingUTF8 = "UTF-8";


    /**
     * @return Instance Class PropertiesUtils
     */
    public static UtilPropiedades getInstance() {
        if (instance == null) {
            instance = new UtilPropiedades();
        }
        return instance; 
    }

    /**
     * @return Instance Class PropertiesUtils
     */
    public static UtilPropiedades getInstance(String filePropertiesConfig, String encondingUTF8) {
        if (instance == null) {
            instance = new UtilPropiedades(filePropertiesConfig, encondingUTF8);
        }
        return instance;
    }

    /**
     * @return Instance Class PropertiesUtils
     */
    public static UtilPropiedades getInstance(String filePropertiesConfig) {
        if (instance == null) {
            instance = new UtilPropiedades(filePropertiesConfig);
        } else {
            instance.leerFichero(filePropertiesConfig);
        }
        return instance;
    }

    /**
     * Constructor por defecto para el fichero.propiedades y enconding UTF8.
     */
    public UtilPropiedades() {
        this.leerFichero();
    }

    /**
     * Constructor pasando por parametros del nombre del fichero y el encoding.
     *
     * @param filePropertiesConfig
     * @param encondingUTF8
     */
    public UtilPropiedades(String filePropertiesConfig, String encondingUTF8) {
        this.filePropertiesConfig = filePropertiesConfig;
        this.encondingUTF8 = encondingUTF8;
        this.leerFichero();

    }

    /**
     * Constructor pasando por parametros del nombre del fichero.
     *
     * @param filePropertiesConfig
     */
    public UtilPropiedades(String filePropertiesConfig) {
        this.filePropertiesConfig = filePropertiesConfig;
        this.leerFichero();

    }

    /**
     * Método lee las propiedades del fichero para poder recuperarlas con getValorKey
     */
    public void leerFichero() {
        try {
            InputStream inputFileProperties = UtilPropiedades.class.getClassLoader().getResourceAsStream(filePropertiesConfig);
            if (inputFileProperties != null) {
                properties.clear();
                properties.load(new InputStreamReader(inputFileProperties, encondingUTF8));
            }
        } catch (Exception e) {
            LOG.info(e.getMessage());
        }
    }

    /**
     * Método que obtiene todos los registros de un properties.
     *
     * @param nombreFichero
     * @return Properties
     */
    public Properties leerFichero(String nombreFichero) {
        try {
            InputStream inputFileProperties = UtilPropiedades.class.getClassLoader().getResourceAsStream(nombreFichero);
            if (inputFileProperties != null) {
                properties.clear();
                properties.load(new InputStreamReader(inputFileProperties, encondingUTF8));
            }
            return properties;

        } catch (Exception e) {
            LOG.info(e.getMessage());
            return null;
        }
    }

    /**
     * Get value of key
     *
     * @param key
     * @return
     */
    public String getValorKey(String key) {
        return properties.getProperty(key);
    }

    /**
     * Mostrar todas las propiedas que empiecen por un texto
     *
     * @param cadenaComienzo
     * @return
     */
    /*public List<String> listarPropiedadesQueEmpiecenPor(String cadenaComienzo) {
        List<String> propiedades = new ArrayList<>();
        for (Enumeration<?> e = properties.propertyNames(); e.hasMoreElements(); ) {
            String name = (String) e.nextElement();
            String value = properties.getProperty(name);
            // Ahora introducimos en la lista sólo los que comienzan por la cadena especificada.
            if (name.startsWith(cadenaComienzo)) {
                propiedades.add(value);
            }
        }
        return propiedades;
    }*/

    /**
     * @return the filePropertiesConfig
     */
    public String getFilePropertiesConfig() {
        return filePropertiesConfig;
    }

    /**
     * @param filePropertiesConfigParam the filePropertiesConfig to set
     */
    public void setFilePropertiesConfig(String filePropertiesConfigParam) {
        this.filePropertiesConfig = filePropertiesConfigParam;
    }

    /**
     * @return the enconding_UTF8
     */
    public String getEncondingUTF8() {
        return encondingUTF8;
    }

    /**
     * @param encondingUTF8Param the enconding_UTF8 to set
     */
    public void setEncondingUTF8(String encondingUTF8Param) {
        this.encondingUTF8 = encondingUTF8Param;
    }

}
