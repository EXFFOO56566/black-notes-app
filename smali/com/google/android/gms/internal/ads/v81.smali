.class final synthetic Lcom/google/android/gms/internal/ads/v81;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/xk1;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/xk1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/v81;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/v81;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/v81;->a:Lcom/google/android/gms/internal/ads/xk1;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/t81;

    check-cast p1, Landroid/location/Location;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/ads/t81;-><init>(Landroid/location/Location;)V

    return-object v0
.end method
