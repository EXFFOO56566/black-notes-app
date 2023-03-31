.class final synthetic Lcom/google/android/gms/internal/ads/sr0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/k9;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/k9;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/sr0;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/sr0;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/sr0;->a:Lcom/google/android/gms/internal/ads/k9;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/fg;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/fg;-><init>(Lorg/json/JSONObject;)V

    return-object v0
.end method
