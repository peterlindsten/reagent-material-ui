(ns reagent-material-ui.icons.border-inner-two-tone
  "Imports @material-ui/icons/BorderInnerTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def border-inner-two-tone (create-svg-icon (e "path" #js {"d" "M3 15h2v2H3zM3 3h2v2H3zm0 16h2v2H3zm8 2h2v-8h8v-2h-8V3h-2v8H3v2h8zm-4-2h2v2H7zm12-4h2v2h-2zm-4 4h2v2h-2zm4 0h2v2h-2zM3 7h2v2H3zm16 0h2v2h-2zM7 3h2v2H7zm8 0h2v2h-2zm4 0h2v2h-2z"})
                                            "BorderInnerTwoTone"))
