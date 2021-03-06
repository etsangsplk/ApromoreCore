/**
 * Copyright (c) 2006
 * Martin Czuchra, Nicolas Peters, Daniel Polak, Willi Tscheschner
 *
 * Permission is hereby granted, free of charge, to any person obtaining a
 * copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 **/
if (!ORYX.Plugins)
    ORYX.Plugins = new Object();

ORYX.Plugins.Save = Clazz.extend({

    facade: undefined,

    processURI: undefined,

    changeSymbol: "*",

    construct: function (facade) {
        this.facade = facade;
    },

    updateTitle: function () {

    },

    onUnLoad: function () {

    },


    saveSynchronously: function (forceNew, modelInfo) {

    },

    /**
     * Get the model data and call the success callback
     *
     * @param {Function} success Success callback
     */
    retrieveModelData: function (success) {

    },

    sendSaveRequest: function (method, url, params, forceNew, success, failure) {

    },

    /**
     * Saves the current process to the server.
     */
    save: function (forceNew, event) {

    }
});

