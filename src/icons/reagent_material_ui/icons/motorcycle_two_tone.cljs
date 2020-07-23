(ns reagent-material-ui.icons.motorcycle-two-tone
  "Imports @material-ui/icons/MotorcycleTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def motorcycle-two-tone (create-svg-icon (e react/Fragment nil (e "path" #js {"d" "M9.7 12.31l.25.69h.77l2-2H8.98c.3.39.54.83.72 1.31z", "opacity" ".3"}) (e "path" #js {"d" "M19.44 9.03L15.41 5H11v2h3.59l2 2H5c-2.8 0-5 2.2-5 5s2.2 5 5 5c2.46 0 4.45-1.69 4.9-4h1.65l2.77-2.77c-.21.54-.32 1.14-.32 1.77 0 2.8 2.2 5 5 5s5-2.2 5-5c0-2.65-1.97-4.77-4.56-4.97zM7.82 15C7.4 16.15 6.28 17 5 17c-1.63 0-3-1.37-3-3s1.37-3 3-3c1.28 0 2.4.85 2.82 2H5v2h2.82zm2.9-2h-.77l-.25-.69c-.18-.48-.42-.92-.72-1.31h3.74l-2 2zM19 17c-1.66 0-3-1.34-3-3s1.34-3 3-3 3 1.34 3 3-1.34 3-3 3z"}))
                                          "MotorcycleTwoTone"))
