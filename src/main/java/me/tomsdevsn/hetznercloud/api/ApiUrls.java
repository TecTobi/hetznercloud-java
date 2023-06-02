package me.tomsdevsn.hetznercloud.api;


/**
 * Defines the API URLs for the Hetzner Cloud server API.
 * This class provides a set of constants representing the base URLs and URL templates for various API endpoints of the Hetzner Cloud server API.
 * Each constant represents a specific API endpoint or URL template that can be used to construct URLs for making API requests.
 * The URLs defined in this class are used to interact with resources such as servers,
 * actions, floating IPs, ISOs, images, datacenters, volumes, networks, SSH keys,
 * load balancers, firewalls, locations, load balancer types, server types, and metrics for servers and load balancers.
 * It provides a centralized and structured way to manage and access the API URLs.
 * Note that the constants in this class should be used as building blocks for constructing complete URLs
 * by appending necessary path parameters or query parameters based on specific API calls.
 */

public class ApiUrls {
    // Query parameters
    public static final String QUERY_PARAM_NAME = "name";

    // Constants representing base URLs and URL templates for various API endpoints
    public static final String BASE_API_VERSION = "v1";
    public static final String BASE_API_URL = "https://api.hetzner.cloud" + "/" + BASE_API_VERSION;

    // Servers
    public static final String SERVERS_URL = BASE_API_URL + "/servers";
    public static final String SERVERS_URL_TEMPLATE = SERVERS_URL + "/%s";

    // Actions
    public static final String ADD_SERVER_TO_PLACEMENT_GROUP_URL_TEMPLATE = "/servers/%s/actions/add_to_placement_group";
    public static final String REMOVE_SERVER_FROM_PLACEMENT_GROUP_URL_TEMPLATE = "/servers/%s/actions/remove_from_placement_group";
    public static final String SERVER_ACTIONS_URL_TEMPLATE = "/servers/%s/actions";

    // Floating IPs
    public static final String FLOATING_IP_ACTIONS_URL_TEMPLATE = "/floating_ips/%s/actions";

    // ISOs
    public static final String ISOS_URL = BASE_API_URL + "/isos";
    public static final String ISOS_URL_TEMPLATE = ISOS_URL + "/%s";

    // Images
    public static final String IMAGES_URL = BASE_API_URL + "/images";
    public static final String IMAGES_URL_TEMPLATE = IMAGES_URL + "/%s";

    // Datacenters
    public static final String DATACENTERS_URL = BASE_API_URL + "/datacenters";

    // Volumes
    public static final String VOLUMES_URL = BASE_API_URL + "/volumes";
    public static final String VOLUMES_URL_TEMPLATE = VOLUMES_URL + "/%s";

    // Networks
    public static final String NETWORKS_URL = BASE_API_URL + "/networks";
    public static final String NETWORKS_URL_TEMPLATE = NETWORKS_URL + "/%s";

    // SSH Keys
    public static final String SSH_KEYS_URL = BASE_API_URL + "/ssh_keys";
    public static final String SSH_KEYS_URL_TEMPLATE = SSH_KEYS_URL + "/%s";

    // Load Balancers
    public static final String LOAD_BALANCERS_URL = BASE_API_URL + "/load_balancers";
    public static final String LOAD_BALANCERS_URL_TEMPLATE = LOAD_BALANCERS_URL + "/%s";

    // Floating IPs
    public static final String FLOATING_IPS_URL = BASE_API_URL + "/floating_ips";
    public static final String FLOATING_IPS_URL_TEMPLATE = FLOATING_IPS_URL + "/%s";

    // Firewalls
    public static final String FIREWALLS_URL = BASE_API_URL + "/firewalls";
    public static final String FIREWALLS_URL_TEMPLATE = FIREWALLS_URL + "/%s";

    // Locations
    public static final String LOCATIONS_URL = BASE_API_URL + "/locations";
    public static final String LOCATIONS_URL_TEMPLATE = LOCATIONS_URL + "/%s";

    // Load Balancer Types
    public static final String LOAD_BALANCER_TYPES_URL = BASE_API_URL + "/load_balancer_types";
    public static final String LOAD_BALANCER_TYPES_URL_TEMPLATE = LOAD_BALANCER_TYPES_URL + "/%s";

    // Server Types
    public static final String SERVER_TYPES_URL = BASE_API_URL + "/server_types";
    public static final String SERVER_TYPES_URL_TEMPLATE = SERVER_TYPES_URL + "/%s";

    // Floating IP Actions
    public static final String FLOATING_IP_ACTIONS_URL = BASE_API_URL + "/floating_ips_actions";

    // Server Metrics
    public static final String SERVER_METRICS_URL_TEMPLATE = BASE_API_URL + "/servers/%s/metrics";

    // Load Balancer Metrics
    public static final String LOAD_BALANCER_METRICS_URL_TEMPLATE = LOAD_BALANCERS_URL_TEMPLATE + "/metrics";

    /**
     * Constructs the URL for getting networks with a specific name.
     *
     * @param name The name of the network.
     * @return The URL for getting networks with the specified name.
     */
    public static String getNetworksUrlWithName(String name) {
        return NETWORKS_URL + "?" + QUERY_PARAM_NAME + "=" + name;
    }

    /**
     * Constructs the URL for getting images with a specific name.
     *
     * @param name The name of the image.
     * @return The URL for getting images with the specified name.
     */
    public static String getImagesUrlWithName(String name) {
        return IMAGES_URL + "?" + QUERY_PARAM_NAME + "=" + name;
    }

    private ApiUrls() {
        // Private constructor to prevent instantiation
    }
}
