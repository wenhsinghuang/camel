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

import jakarta.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.arangodb.ArangoDbComponent;

/**
 * Perform operations on ArangoDb when used as a Document Database, or as a
 * Graph Database
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface ArangodbComponentBuilderFactory {

    /**
     * ArangoDb (camel-arangodb)
     * Perform operations on ArangoDb when used as a Document Database, or as a
     * Graph Database
     * 
     * Category: database,nosql
     * Since: 3.5
     * Maven coordinates: org.apache.camel:camel-arangodb
     * 
     * @return the dsl builder
     */
    static ArangodbComponentBuilder arangodb() {
        return new ArangodbComponentBuilderImpl();
    }

    /**
     * Builder for the ArangoDb component.
     */
    interface ArangodbComponentBuilder
            extends
                ComponentBuilder<ArangoDbComponent> {
        /**
         * Component configuration.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.arangodb.ArangoDbConfiguration&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param configuration the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder configuration(
                org.apache.camel.component.arangodb.ArangoDbConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Collection name, when using ArangoDb as a Document Database. Set the
         * documentCollection name when using the CRUD operation on the document
         * database collections (SAVE_DOCUMENT , FIND_DOCUMENT_BY_KEY,
         * UPDATE_DOCUMENT, DELETE_DOCUMENT).
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param documentCollection the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder documentCollection(
                java.lang.String documentCollection) {
            doSetProperty("documentCollection", documentCollection);
            return this;
        }
        /**
         * Collection name of vertices, when using ArangoDb as a Graph Database.
         * Set the edgeCollection name to perform CRUD operation on edges using
         * these operations : SAVE_VERTEX, FIND_VERTEX_BY_KEY, UPDATE_VERTEX,
         * DELETE_VERTEX. The graph attribute is mandatory.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param edgeCollection the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder edgeCollection(
                java.lang.String edgeCollection) {
            doSetProperty("edgeCollection", edgeCollection);
            return this;
        }
        /**
         * Graph name, when using ArangoDb as a Graph Database. Combine this
         * attribute with one of the two attributes vertexCollection and
         * edgeCollection.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param graph the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder graph(java.lang.String graph) {
            doSetProperty("graph", graph);
            return this;
        }
        /**
         * ArangoDB host. If host and port are default, this field is Optional.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param host the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder host(java.lang.String host) {
            doSetProperty("host", host);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: &lt;code&gt;boolean&lt;/code&gt; type.
         * 
         * Default: false
         * Group: producer
         * 
         * @param lazyStartProducer the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Operations to perform on ArangoDb. For the operation AQL_QUERY, no
         * need to specify a collection or graph.
         * 
         * The option is a:
         * &lt;code&gt;org.apache.camel.component.arangodb.ArangoDbOperation&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param operation the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder operation(
                org.apache.camel.component.arangodb.ArangoDbOperation operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * ArangoDB exposed port. If host and port are default, this field is
         * Optional.
         * 
         * The option is a: &lt;code&gt;int&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param port the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder port(int port) {
            doSetProperty("port", port);
            return this;
        }
        /**
         * Collection name of vertices, when using ArangoDb as a Graph Database.
         * Set the vertexCollection name to perform CRUD operation on vertices
         * using these operations : SAVE_EDGE, FIND_EDGE_BY_KEY, UPDATE_EDGE,
         * DELETE_EDGE. The graph attribute is mandatory.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: producer
         * 
         * @param vertexCollection the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder vertexCollection(
                java.lang.String vertexCollection) {
            doSetProperty("vertexCollection", vertexCollection);
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
        default ArangodbComponentBuilder autowiredEnabled(
                boolean autowiredEnabled) {
            doSetProperty("autowiredEnabled", autowiredEnabled);
            return this;
        }
        /**
         * ArangoDB password. If user and password are default, this field is
         * Optional.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param password the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder password(java.lang.String password) {
            doSetProperty("password", password);
            return this;
        }
        /**
         * ArangoDB user. If user and password are default, this field is
         * Optional.
         * 
         * The option is a: &lt;code&gt;java.lang.String&lt;/code&gt; type.
         * 
         * Group: security
         * 
         * @param user the value to set
         * @return the dsl builder
         */
        default ArangodbComponentBuilder user(java.lang.String user) {
            doSetProperty("user", user);
            return this;
        }
    }

    class ArangodbComponentBuilderImpl
            extends
                AbstractComponentBuilder<ArangoDbComponent>
            implements
                ArangodbComponentBuilder {
        @Override
        protected ArangoDbComponent buildConcreteComponent() {
            return new ArangoDbComponent();
        }
        private org.apache.camel.component.arangodb.ArangoDbConfiguration getOrCreateConfiguration(
                org.apache.camel.component.arangodb.ArangoDbComponent component) {
            if (component.getConfiguration() == null) {
                component.setConfiguration(new org.apache.camel.component.arangodb.ArangoDbConfiguration());
            }
            return component.getConfiguration();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((ArangoDbComponent) component).setConfiguration((org.apache.camel.component.arangodb.ArangoDbConfiguration) value); return true;
            case "documentCollection": getOrCreateConfiguration((ArangoDbComponent) component).setDocumentCollection((java.lang.String) value); return true;
            case "edgeCollection": getOrCreateConfiguration((ArangoDbComponent) component).setEdgeCollection((java.lang.String) value); return true;
            case "graph": getOrCreateConfiguration((ArangoDbComponent) component).setGraph((java.lang.String) value); return true;
            case "host": getOrCreateConfiguration((ArangoDbComponent) component).setHost((java.lang.String) value); return true;
            case "lazyStartProducer": ((ArangoDbComponent) component).setLazyStartProducer((boolean) value); return true;
            case "operation": getOrCreateConfiguration((ArangoDbComponent) component).setOperation((org.apache.camel.component.arangodb.ArangoDbOperation) value); return true;
            case "port": getOrCreateConfiguration((ArangoDbComponent) component).setPort((int) value); return true;
            case "vertexCollection": getOrCreateConfiguration((ArangoDbComponent) component).setVertexCollection((java.lang.String) value); return true;
            case "autowiredEnabled": ((ArangoDbComponent) component).setAutowiredEnabled((boolean) value); return true;
            case "password": getOrCreateConfiguration((ArangoDbComponent) component).setPassword((java.lang.String) value); return true;
            case "user": getOrCreateConfiguration((ArangoDbComponent) component).setUser((java.lang.String) value); return true;
            default: return false;
            }
        }
    }
}