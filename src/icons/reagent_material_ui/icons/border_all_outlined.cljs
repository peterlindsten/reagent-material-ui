(ns reagent-material-ui.icons.border-all-outlined
  "Imports @material-ui/icons/BorderAllOutlined as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-all-outlined (create-svg-icon (e "path" #js {"d" "M3 3v18h18V3H3zm8 16H5v-6h6v6zm0-8H5V5h6v6zm8 8h-6v-6h6v6zm0-8h-6V5h6v6z"})
                                          "BorderAllOutlined"))
