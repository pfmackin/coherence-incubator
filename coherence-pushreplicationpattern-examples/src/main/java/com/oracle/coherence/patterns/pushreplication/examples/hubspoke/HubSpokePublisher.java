/*
 * File: HubSpokePublisher.java
 *
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * The contents of this file are subject to the terms and conditions of 
 * the Common Development and Distribution License 1.0 (the "License").
 *
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the License by consulting the LICENSE.txt file
 * distributed with this file, or by consulting
 * or https://oss.oracle.com/licenses/CDDL
 *
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing the software, include this License Header Notice in each
 * file and include the License file LICENSE.txt.
 *
 * MODIFICATIONS:
 * If applicable, add the following below the License Header, with the fields
 * enclosed by brackets [] replaced by your own identifying information:
 * "Portions Copyright [year] [name of copyright owner]"
 */

package com.oracle.coherence.patterns.pushreplication.examples.hubspoke;

import com.oracle.coherence.patterns.pushreplication.examples.PublisherHelper;

/**
 * The {@link HubSpokePublisher} demonstrates replicating cache entries
 * from a publishing (active) site to one or more listening (passive) sites.
 * <p>
 * Copyright (c) 2010. All Rights Reserved. Oracle Corporation.<br>
 * Oracle is a registered trademark of Oracle Corporation and/or its affiliates.
 *
 * @author Paul Mackin
 */
public class HubSpokePublisher
{
    /**
     * The Entry Point for the {@link HubSpokePublisher}.
     *
     * @param args
     *
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException
    {
        // ------------------------------
        // SETUP
        // ------------------------------

        PublisherHelper publisher = new PublisherHelper("publishing-cache",    // local site cache name
                                                        System.getProperty("tangosol.coherence.site"));    // this site name

        // Load the cache
        publisher.loadCache();

        System.out.println("success.");
    }
}
