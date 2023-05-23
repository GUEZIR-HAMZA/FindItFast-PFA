const baseUrl = `http://localhost:${process.env.REACT_APP_API_PORT || "3002"}`;

export const createCard = async (endpoint, body) => {
  try {
    const response = await fetch(baseUrl + endpoint, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(body),
    });
    const data = await response.json();
    console.log("AQUI", data);
    return data;
  } catch (error) {
    console.error(error);
  }
};


export const requestCardData = async (endpoint) => {
  const response = await fetch(baseUrl + endpoint);
  const data = await response.json();
  return data;
};

export default baseUrl;
