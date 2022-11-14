/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.processing.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.jetty11.JettyHttpComponent11;

/**
 * Expose HTTP endpoints using Jetty 11.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface JettyComponentBuilderFactory {

    /**
     * Jetty (camel-jetty)
     * Expose HTTP endpoints using Jetty 11.
     * 
     * Category: http
     * Since: 1.2
     * Maven coordinates: org.apache.camel:camel-jetty
     * 
     * @return the dsl builder
     */
    static JettyComponentBuilder jetty() {
        return new JettyComponentBuilderImpl();
    }

    /**
     * Builder for the Jetty component.
     */
    interface JettyComponentBuilder
            extends
                ComponentBuilder<JettyHttpComponent9> {
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param bridgeErrorHandler the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Allows to set a timeout in millis when using Jetty as consumer
         * (server). By default Jetty uses 30000. You can use a value of = 0 to
         * never expire. If a timeout occurs then the request will be expired
         * and Jetty will return back a http error 503 to the client. This
         * option is only in use when using Jetty with the Asynchronous Routing
         * Engine.
         * 
         * The option is a: &lt;code&gt;java.lang.Long&lt;/code&gt; type.
         * 
         * Default: 30000
         * Group: consumer
         * 
         * @param continuationTimeout the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder continuationTimeout(
                java.lang.Long continuationTimeout) {
            doSetProperty("continuationTimeout", continuationTimeout);
            return this;
        }
        /**
         * If this option is true, Jetty JMX support will be enabled for this
         * endpoint.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param enableJmx the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder enableJmx(boolean enableJmx) {
            doSetProperty("enableJmx", enableJmx);
            return this;
        }
        /**
         * To set a value for maximum number of threads in server thread pool.
         * Notice that both a min and max size must be configured.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param maxThreads the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder maxThreads(java.lang.Integer maxThreads) {
            doSetProperty("maxThreads", maxThreads);
            return this;
        }
        /**
         * To set a value for minimum number of threads in server thread pool.
         * Notice that both a min and max size must be configured.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param minThreads the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder minThreads(java.lang.Integer minThreads) {
            doSetProperty("minThreads", minThreads);
            return this;
        }
        /**
         * If enabled and an Exchange failed processing on the consumer side the
         * response's body won't contain the exception's stack trace.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param muteException the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder muteException(boolean muteException) {
            doSetProperty("muteException", muteException);
            return this;
        }
        /**
         * Allows to configure a custom value of the request buffer size on the
         * Jetty connectors.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param requestBufferSize the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder requestBufferSize(
                java.lang.Integer requestBufferSize) {
            doSetProperty("requestBufferSize", requestBufferSize);
            return this;
        }
        /**
         * Allows to configure a custom value of the request header size on the
         * Jetty connectors.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param requestHeaderSize the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder requestHeaderSize(
                java.lang.Integer requestHeaderSize) {
            doSetProperty("requestHeaderSize", requestHeaderSize);
            return this;
        }
        /**
         * Allows to configure a custom value of the response buffer size on the
         * Jetty connectors.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param responseBufferSize the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder responseBufferSize(
                java.lang.Integer responseBufferSize) {
            doSetProperty("responseBufferSize", responseBufferSize);
            return this;
        }
        /**
         * Allows to configure a custom value of the response header size on the
         * Jetty connectors.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: consumer
         * 
         * @param responseHeaderSize the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder responseHeaderSize(
                java.lang.Integer responseHeaderSize) {
            doSetProperty("responseHeaderSize", responseHeaderSize);
            return this;
        }
        /**
         * If the option is true, jetty will send the server header with the
         * jetty version information to the client which sends the request. NOTE
         * please make sure there is no any other camel-jetty endpoint is share
         * the same port, otherwise this option may not work as expected.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param sendServerVersion the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder sendServerVersion(
                boolean sendServerVersion) {
            doSetProperty("sendServerVersion", sendServerVersion);
            return this;
        }
        /**
         * Whether or not to use Jetty continuations for the Jetty Server.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: consumer
         * 
         * @param useContinuation the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder useContinuation(boolean useContinuation) {
            doSetProperty("useContinuation", useContinuation);
            return this;
        }
        /**
         * To use the X-Forwarded-For header in
         * HttpServletRequest.getRemoteAddr.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: consumer
         * 
         * @param useXForwardedForHeader the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder useXForwardedForHeader(
                boolean useXForwardedForHeader) {
            doSetProperty("useXForwardedForHeader", useXForwardedForHeader);
            return this;
        }
        /**
         * To use a custom thread pool for the server. This option should only
         * be used in special circumstances.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.jetty.util.thread.ThreadPool&lt;/code&gt;
         * type.
         * 
         * Group: consumer (advanced)
         * 
         * @param threadPool the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder threadPool(
                org.eclipse.jetty.util.thread.ThreadPool threadPool) {
            doSetProperty("threadPool", threadPool);
            return this;
        }
        /**
         * Whether to allow java serialization when a request uses
         * context-type=application/x-java-serialized-object. This is by default
         * turned off. If you enable this then be aware that Java will
         * deserialize the incoming data from the request to Java and that can
         * be a potential security risk.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: advanced
         * 
         * @param allowJavaSerializedObject the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder allowJavaSerializedObject(
                boolean allowJavaSerializedObject) {
            doSetProperty("allowJavaSerializedObject", allowJavaSerializedObject);
            return this;
        }
        /**
         * Whether autowiring is enabled. This is used for automatic autowiring
         * options (the option must be marked as autowired) by looking up in the
         * registry to find if there is a single instance of matching type,
         * which then gets configured on the component. This can be used for
         * automatic configuring JDBC data sources, JMS connection factories,
         * AWS Clients, etc.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: true
         * Group: advanced
         * 
         * @param autowiredEnabled the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder autowiredEnabled(boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * This option is used to set the ErrorHandler that Jetty server uses.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.jetty.server.handler.ErrorHandler&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param errorHandler the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder errorHandler(
                org.eclipse.jetty.server.handler.ErrorHandler errorHandler) {
            doSetProperty("errorHandler", errorHandler);
            return this;
        }
        /**
         * Not to be used - use JettyHttpBinding instead.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.http.common.HttpBinding&lt;/code&gt;
         * type.
         * 
         * Group: advanced
         * 
         * @param httpBinding the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder httpBinding(
                org.apache.camel.http.common.HttpBinding httpBinding) {
            doSetProperty("httpBinding", httpBinding);
            return this;
        }
        /**
         * Jetty component does not use HttpConfiguration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.http.common.HttpConfiguration&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param httpConfiguration the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder httpConfiguration(
                org.apache.camel.http.common.HttpConfiguration httpConfiguration) {
            doSetProperty("httpConfiguration", httpConfiguration);
            return this;
        }
        /**
         * To use a custom org.apache.camel.component.jetty.JettyHttpBinding,
         * which are used to customize how a response should be written for the
         * producer.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.jetty.JettyHttpBinding&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param jettyHttpBinding the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder jettyHttpBinding(
                org.apache.camel.component.jetty.JettyHttpBinding jettyHttpBinding) {
            doSetProperty("jettyHttpBinding", jettyHttpBinding);
            return this;
        }
        /**
         * To use a existing configured org.eclipse.jetty.jmx.MBeanContainer if
         * JMX is enabled that Jetty uses for registering mbeans.
         * 
         * The option is a:
         * &lt;code&gt;org.eclipse.jetty.jmx.MBeanContainer&lt;/code&gt; type.
         * 
         * Group: advanced
         * 
         * @param mbContainer the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder mbContainer(
                org.eclipse.jetty.jmx.MBeanContainer mbContainer) {
            doSetProperty("mbContainer", mbContainer);
            return this;
        }
        /**
         * To use a custom org.apache.camel.spi.HeaderFilterStrategy to filter
         * header to and from Camel message.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.spi.HeaderFilterStrategy&lt;/code&gt;
         * type.
         * 
         * Group: filter
         * 
         * @param headerFilterStrategy the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder headerFilterStrategy(
                org.apache.camel.spi.HeaderFilterStrategy headerFilterStrategy) {
            doSetProperty("headerFilterStrategy", headerFilterStrategy);
            return this;
        }
        /**
         * To use a http proxy to configure the hostname.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyHost the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder proxyHost(java.lang.String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To use a http proxy to configure the port number.
         * 
         * The option is a: &lt;code&gt;java.lang.Integer&lt;/code&gt; type.
         * 
         * Group: proxy
         * 
         * @param proxyPort the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder proxyPort(java.lang.Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * Specifies the location of the Java keystore file, which contains the
         * Jetty server's own X.509 certificate in a key entry.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param keystore the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder keystore(java.lang.String keystore) {
            doSetProperty("keystore", keystore);
            return this;
        }
        /**
         * A map which contains general HTTP connector properties. Uses the same
         * principle as sslSocketConnectorProperties.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param socketConnectorProperties the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder socketConnectorProperties(
                java.util.Map<java.lang.String, java.lang.Object> socketConnectorProperties) {
            doSetProperty("socketConnectorProperties", socketConnectorProperties);
            return this;
        }
        /**
         * A map which contains per port number specific HTTP connectors. Uses
         * the same principle as sslSocketConnectors.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.Integer,
         * org.eclipse.jetty.server.Connector&amp;gt;&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param socketConnectors the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder socketConnectors(
                java.util.Map<java.lang.Integer, org.eclipse.jetty.server.Connector> socketConnectors) {
            doSetProperty("socketConnectors", socketConnectors);
            return this;
        }
        /**
         * To configure security using SSLContextParameters.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.support.jsse.SSLContextParameters&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslContextParameters the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder sslContextParameters(
                org.apache.camel.support.jsse.SSLContextParameters sslContextParameters) {
            doSetProperty("sslContextParameters", sslContextParameters);
            return this;
        }
        /**
         * The key password, which is used to access the certificate's key entry
         * in the keystore (this is the same password that is supplied to the
         * keystore command's -keypass option).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslKeyPassword the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder sslKeyPassword(
                java.lang.String sslKeyPassword) {
            doSetProperty("sslKeyPassword", sslKeyPassword);
            return this;
        }
        /**
         * The ssl password, which is required to access the keystore file (this
         * is the same password that is supplied to the keystore command's
         * -storepass option).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslPassword the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder sslPassword(java.lang.String sslPassword) {
            doSetProperty("sslPassword", sslPassword);
            return this;
        }
        /**
         * A map which contains general SSL connector properties.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.String,
         * java.lang.Object&amp;gt;&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslSocketConnectorProperties the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder sslSocketConnectorProperties(
                java.util.Map<java.lang.String, java.lang.Object> sslSocketConnectorProperties) {
            doSetProperty("sslSocketConnectorProperties", sslSocketConnectorProperties);
            return this;
        }
        /**
         * A map which contains per port number specific SSL connectors.
         * 
         * The option is a: &lt;code&gt;java.util.Map&amp;lt;java.lang.Integer,
         * org.eclipse.jetty.server.Connector&amp;gt;&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param sslSocketConnectors the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder sslSocketConnectors(
                java.util.Map<java.lang.Integer, org.eclipse.jetty.server.Connector> sslSocketConnectors) {
            doSetProperty("sslSocketConnectors", sslSocketConnectors);
            return this;
        }
        /**
         * Enable usage of global SSL context parameters.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: security
         * 
         * @param useGlobalSslContextParameters the value to set
         * @return the dsl builder
         */
        default JettyComponentBuilder useGlobalSslContextParameters(
                boolean useGlobalSslContextParameters) {
            doSetProperty("useGlobalSslContextParameters", useGlobalSslContextParameters);
            return this;
        }
    }

    class JettyComponentBuilderImpl
            extends
                AbstractComponentBuilder<JettyHttpComponent9>
            implements
                JettyComponentBuilder {
        @Override
        protected JettyHttpComponent9 buildConcreteComponent() {
            return new JettyHttpComponent9();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "bridgeErrorHandler": ((JettyHttpComponent9) component).setBridgeErrorHandler((boolean) value); return true;
            case "continuationTimeout": ((JettyHttpComponent9) component).setContinuationTimeout((java.lang.Long) value); return true;
            case "enableJmx": ((JettyHttpComponent9) component).setEnableJmx((boolean) value); return true;
            case "maxThreads": ((JettyHttpComponent9) component).setMaxThreads((java.lang.Integer) value); return true;
            case "minThreads": ((JettyHttpComponent9) component).setMinThreads((java.lang.Integer) value); return true;
            case "muteException": ((JettyHttpComponent9) component).setMuteException((boolean) value); return true;
            case "requestBufferSize": ((JettyHttpComponent9) component).setRequestBufferSize((java.lang.Integer) value); return true;
            case "requestHeaderSize": ((JettyHttpComponent9) component).setRequestHeaderSize((java.lang.Integer) value); return true;
            case "responseBufferSize": ((JettyHttpComponent9) component).setResponseBufferSize((java.lang.Integer) value); return true;
            case "responseHeaderSize": ((JettyHttpComponent9) component).setResponseHeaderSize((java.lang.Integer) value); return true;
            case "sendServerVersion": ((JettyHttpComponent9) component).setSendServerVersion((boolean) value); return true;
            case "useContinuation": ((JettyHttpComponent9) component).setUseContinuation((boolean) value); return true;
            case "useXForwardedForHeader": ((JettyHttpComponent9) component).setUseXForwardedForHeader((boolean) value); return true;
            case "threadPool": ((JettyHttpComponent9) component).setThreadPool((org.eclipse.jetty.util.thread.ThreadPool) value); return true;
            case "allowJavaSerializedObject": ((JettyHttpComponent9) component).setAllowJavaSerializedObject((boolean) value); return true;
            case "autowiredEnabled": ((JettyHttpComponent9) component).setAutowiredEnabled((boolean) value); return true;
            case "errorHandler": ((JettyHttpComponent9) component).setErrorHandler((org.eclipse.jetty.server.handler.ErrorHandler) value); return true;
            case "httpBinding": ((JettyHttpComponent9) component).setHttpBinding((org.apache.camel.http.common.HttpBinding) value); return true;
            case "httpConfiguration": ((JettyHttpComponent9) component).setHttpConfiguration((org.apache.camel.http.common.HttpConfiguration) value); return true;
            case "jettyHttpBinding": ((JettyHttpComponent9) component).setJettyHttpBinding((org.apache.camel.component.jetty.JettyHttpBinding) value); return true;
            case "mbContainer": ((JettyHttpComponent9) component).setMbContainer((org.eclipse.jetty.jmx.MBeanContainer) value); return true;
            case "headerFilterStrategy": ((JettyHttpComponent9) component).setHeaderFilterStrategy((org.apache.camel.spi.HeaderFilterStrategy) value); return true;
            case "proxyHost": ((JettyHttpComponent9) component).setProxyHost((java.lang.String) value); return true;
            case "proxyPort": ((JettyHttpComponent9) component).setProxyPort((java.lang.Integer) value); return true;
            case "keystore": ((JettyHttpComponent9) component).setKeystore((java.lang.String) value); return true;
            case "socketConnectorProperties": ((JettyHttpComponent9) component).setSocketConnectorProperties((java.util.Map) value); return true;
            case "socketConnectors": ((JettyHttpComponent9) component).setSocketConnectors((java.util.Map) value); return true;
            case "sslContextParameters": ((JettyHttpComponent9) component).setSslContextParameters((org.apache.camel.support.jsse.SSLContextParameters) value); return true;
            case "sslKeyPassword": ((JettyHttpComponent9) component).setSslKeyPassword((java.lang.String) value); return true;
            case "sslPassword": ((JettyHttpComponent9) component).setSslPassword((java.lang.String) value); return true;
            case "sslSocketConnectorProperties": ((JettyHttpComponent9) component).setSslSocketConnectorProperties((java.util.Map) value); return true;
            case "sslSocketConnectors": ((JettyHttpComponent9) component).setSslSocketConnectors((java.util.Map) value); return true;
            case "useGlobalSslContextParameters": ((JettyHttpComponent9) component).setUseGlobalSslContextParameters((boolean) value); return true;
            default: return false;
            }
        }
    }
}