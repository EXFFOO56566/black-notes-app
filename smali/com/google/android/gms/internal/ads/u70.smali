.class final synthetic Lcom/google/android/gms/internal/ads/u70;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/ads/l90;


# static fields
.field static final a:Lcom/google/android/gms/internal/ads/l90;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/ads/u70;

    invoke-direct {v0}, Lcom/google/android/gms/internal/ads/u70;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/ads/u70;->a:Lcom/google/android/gms/internal/ads/l90;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/ads/internal/overlay/o;

    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/overlay/o;->onResume()V

    return-void
.end method
